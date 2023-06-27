package apresentacao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;


public class MontarTabuleiro extends JPanel{
	
	public MontarTabuleiro() {
		MontarTabuleiro();
	}
	public void MontarTabuleiro(){
		
		JPanel painel2 = new JPanel();
		
		painel2.setLayout(new GridLayout(8,8));
		
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0)) {
					painel2.add(botao(Color.black));				
				} else {
					painel2.add(botao(Color.white));				
				}
			}
		}
		
		int margem = 15;
		painel2.setBorder(new EmptyBorder(margem, margem, margem, margem));
		this.add(painel2, BorderLayout.CENTER);
	}

	public Botoes botao(Color cor) {
		Botoes b1 = new Botoes(cor);
		b1.setBackground(cor);
		return b1;	
	}
	
	

}
