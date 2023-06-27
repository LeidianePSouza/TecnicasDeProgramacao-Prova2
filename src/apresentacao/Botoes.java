package apresentacao;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

public class Botoes extends JButton{

	public Botoes(Color cor) {
		this.setBackground(cor);
		this.setSize(20, 20);
	}
	
	public Botoes botao(Color cor) {
		Botoes b1 = new Botoes(cor);
		b1.setBackground(cor);
		
		return b1;	
	}
	
	
	

	
//	public void criarBotoes() {
//		Botoes b = new Botoes();
//	}
//
//	public Botoes(Layout layout) {
//		// TODO Auto-generated constructor stub
//	}
//	


	
	
}
