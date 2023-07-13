
package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.fiap.controller.EscolhaSeguro;

import java.awt.event.MouseAdapter;

public class TelaEscolherSeguro {

	public JFrame frame;
	private double cotacaoEscolherSeguro;
	private String seguroEscolhido;

	/**
	 * Create the application.
	 */
	public TelaEscolherSeguro() {
		initialize();

		// cotacao

	}
	
//	// criei isso para ver se rodava, mas continua nao passando dessa telas
//	public TelaEscolherSeguro(double cotacaoEscolherSeguro) {
//		this.cotacaoEscolherSeguro = cotacaoEscolherSeguro;
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1363, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon image = new ImageIcon("LogoTokio.png"); // criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame

		JButton btnCompreensivoTotal = new JButton("Compreensivo Total");
		btnCompreensivoTotal.addMouseListener(new MouseAdapter() {
		});
		btnCompreensivoTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				String buttonText = source.getText();
				System.out.println(buttonText);

				// cotacao
				EscolhaSeguro es = new EscolhaSeguro();
				cotacaoEscolherSeguro = 0.09723;
				System.out.println("\nescolha " + btnCompreensivoTotal.getText() + " - " + cotacaoEscolherSeguro + " retorno: " + es.aplicaTaxaEscolhaSeguro(buttonText));
				seguroEscolhido = "Perda Total Por Colisão";
				
				TelaCadastroUsuario2 telaCadastro = new TelaCadastroUsuario2(cotacaoEscolherSeguro, seguroEscolhido);
				telaCadastro.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		btnCompreensivoTotal.setFont(new Font("SansSerif", Font.PLAIN, 30));
		btnCompreensivoTotal.setBackground(new Color(0, 103, 80));
		btnCompreensivoTotal.setForeground(Color.WHITE);
		btnCompreensivoTotal.setBounds(90, 438, 316, 148);
		btnCompreensivoTotal.setBorderPainted(false);
		btnCompreensivoTotal.setBorder(null);
		btnCompreensivoTotal.setFocusPainted(false);
		frame.getContentPane().add(btnCompreensivoTotal);

		JButton btnPerdaTotalPor = new JButton("Perda Total Por Colisão");
		btnPerdaTotalPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				String buttonText = source.getText();
				System.out.println(buttonText);

				// cotacao
				EscolhaSeguro es = new EscolhaSeguro();
				cotacaoEscolherSeguro = es.aplicaTaxaEscolhaSeguro(buttonText);
				System.out.println("\nescolha " + btnPerdaTotalPor.getText() + " - " + cotacaoEscolherSeguro);
				seguroEscolhido = "Perda Total Por Colisão";

				TelaCadastroUsuario2 telaCadastro = new TelaCadastroUsuario2(cotacaoEscolherSeguro, seguroEscolhido); // aqui tava cotacaoEscolherSeguro
				telaCadastro.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});
		btnPerdaTotalPor.setForeground(Color.WHITE);
		btnPerdaTotalPor.setFont(new Font("SansSerif", Font.PLAIN, 30));
		btnPerdaTotalPor.setFocusPainted(false);
		btnPerdaTotalPor.setBorderPainted(false);
		btnPerdaTotalPor.setBorder(null);
		btnPerdaTotalPor.setBackground(new Color(0, 103, 80));
		btnPerdaTotalPor.setBounds(532, 438, 314, 148);
		frame.getContentPane().add(btnPerdaTotalPor);

		JButton btnRouboEFurto = new JButton("Roubo e Furto");
		btnRouboEFurto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				String buttonText = source.getText();
				System.out.println(buttonText);

				// cotacao
//				EscolhaSeguro es = new EscolhaSeguro();
				cotacaoEscolherSeguro += 0.01378;
				System.out.println("\nescolha " + btnRouboEFurto.getText() + " - " + cotacaoEscolherSeguro);
				seguroEscolhido = "Perda Total Por Colisão";
				
				TelaCadastroUsuario2 telaCadastro = new TelaCadastroUsuario2(cotacaoEscolherSeguro, seguroEscolhido);
				telaCadastro.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		btnRouboEFurto.setForeground(Color.WHITE);
		btnRouboEFurto.setFont(new Font("SansSerif", Font.PLAIN, 30));
		btnRouboEFurto.setFocusPainted(false);
		btnRouboEFurto.setBorderPainted(false);
		btnRouboEFurto.setBorder(null);
		btnRouboEFurto.setBackground(new Color(0, 103, 80));
		btnRouboEFurto.setBounds(976, 438, 314, 148);
		frame.getContentPane().add(btnRouboEFurto);

//		
//		if (btnRouboEFurto.isEnabled()) {
//			
//			btnRouboEFurto.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					JButton source = (JButton) e.getSource();
//					String buttonText = source.getText();
//					System.out.println(buttonText);
//
//					TelaCadastroUsuario2 telaCadastro = new TelaCadastroUsuario2();
//					telaCadastro.frame.setVisible(true);
//					frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
//				}
//			});
//		}

		// System.out.println(tipoSeguro);

		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaEscolherSeguro.class.getResource("/TipoDeSeguro.png")));
		lblNewLabel.setBounds(10, -152, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

}
