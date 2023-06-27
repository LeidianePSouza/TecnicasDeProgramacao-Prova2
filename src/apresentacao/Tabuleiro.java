package apresentacao;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

public class Tabuleiro extends JPanel{
	
	Layout layout;

	public Tabuleiro(Layout layout) {
		this.layout = layout;
		montaTab();
	}
	
	public void montaTab() {
		JPanel painel2 = new JPanel();
	
			for (int i=0; i<8; i++) {
				for (int j=0; j<8; j++) {
					if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0)) {
						painel2.add(botao(Color.black));				
					} else {
						painel2.add(botao(Color.white));				

					}
				}
			
			}
		}
		
	
	public Botoes botao(Color cor) {
		Botoes b1 = new Botoes(cor);
		b1.setBackground(cor);
		
		return b1;	
	}
	
	
	
}
