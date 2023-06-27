package apresentacao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

public class Layout extends JFrame{
		
	public Layout(){
		
		this.setSize(700, 900);
		this.setBackground(Color.BLUE);
		this.setResizable(false);
		
		JPanel painel1 = new JPanel();
		JPanel painel2 = new JPanel();
		JPanel painel3 = new JPanel();
						
		JLabel nome = new JLabel("Nome do Jogador: ");
		JTextField caixaNome = new JTextField(10);
		caixaNome.setPreferredSize(new Dimension(150, 30));
		painel1.add(nome);
		painel1.add(caixaNome);
		
		painel1.setBackground(Color.BLUE);		
		painel1.setBorder(new EmptyBorder(15, 15, 15, 15));

		JButton bJogar = new JButton("Jogar");
		bJogar.setPreferredSize(new Dimension(90,30));
		
		JButton bRelatorio = new JButton("Relatório do Jogo");
		bRelatorio.setPreferredSize(new Dimension(150,30));

		painel1.add(bJogar);				
		painel1.add(bRelatorio);
		
		painel2.setLayout(new GridLayout(8,8));
		painel2.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0)) {
					painel2.add(botao(Color.black));				
				} else {
					painel2.add(botao(Color.white));				
				}
			}
		}
		
		painel3.setBackground(Color.BLUE);	
		painel3.setBorder(new EmptyBorder(5, 15, 15, 15));

		JButton bVerificar = new JButton("Verificar");
		bVerificar.setPreferredSize(new Dimension(150, 30));
		
		JButton bSair = new JButton("Sair do Jogo");
		bSair.setPreferredSize(new Dimension(150, 30));
		
		JButton bProximaJogada = new JButton("Próxima Jogada");
		bProximaJogada.setPreferredSize(new Dimension(150, 30));
		
		painel3.add(bProximaJogada);
		painel3.add(bVerificar);
		painel3.add(bSair);
		
		this.add(painel1, BorderLayout.NORTH);
		this.add(painel2, BorderLayout.CENTER);
		this.add(painel3, BorderLayout.SOUTH);	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public Botoes botao(Color cor) {
		Botoes b1 = new Botoes(cor);
		b1.setBackground(cor);
		b1.setPreferredSize(new Dimension (10,10));
		return b1;	
	}
	
	public JLabel nome() {
		return new JLabel();
	}
	
//	private void criarBotoes() {
//		JButton bJogar = new JButton("Jogar");
//		bJogar.setPreferredSize(new Dimension(90,30));
//		//bJogar.addActionListener(new MontarTabuleiro());
//		
//		JButton bRelatorio = new JButton("Relatório do Jogo");
//		bRelatorio.setPreferredSize(new Dimension(150,30));
//		//bRelatorio.addActionListener((ActionListener) new Relatorio(tab));
//
//		JButton bVerificar = new JButton("Verificar");
//		bVerificar.setPreferredSize(new Dimension(90, 30));
//		
//		JButton bProximaJogada = new JButton("Próxima Jogada");
//		bProximaJogada.setPreferredSize(new Dimension(90, 30));
//		
//		JButton bSair = new JButton("Sair do Jogo");
//		bSair.setPreferredSize(new Dimension(90, 30));
//		
//		this.add(bJogar);
//		this.add(bRelatorio);
//		this.add(bVerificar);
//		this.add(bProximaJogada);
//		this.add(bSair);
//	}
}
