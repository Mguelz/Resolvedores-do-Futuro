
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

public class TelaEscolherSeguro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEscolherSeguro window = new TelaEscolherSeguro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaEscolherSeguro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1363, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon image = new ImageIcon("LogoTokio.png"); //criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame

		JButton btnCompreensivoTotal = new JButton("Compreensivo Total");
		btnCompreensivoTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // fechar a janela atual
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
				frame.dispose(); // AÇÃO DO BOTÃO!
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
				frame.dispose(); // AÇÃO DO BOTÃO!
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

		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaEscolherSeguro.class.getResource("/TipoDeSeguro.png")));
		lblNewLabel.setBounds(10, -152, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}
}


//package br.com.fiap.view;
//
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class TelaEscolherSeguro {
//
//	private JFrame frame;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TelaEscolherSeguro window = new TelaEscolherSeguro();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public TelaEscolherSeguro() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 1363, 767);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//
//		JButton btnCompreensivoTotal = new JButton("Compreensivo Total");
//		btnCompreensivoTotal.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose(); // fechar a janela atual
//			}
//		});
//
//		btnCompreensivoTotal.setFont(new Font("SansSerif", Font.PLAIN, 30));
//		btnCompreensivoTotal.setBackground(new Color(0, 103, 80));
//		btnCompreensivoTotal.setForeground(Color.WHITE);
//		btnCompreensivoTotal.setBounds(90, 438, 316, 148);
//		btnCompreensivoTotal.setBorderPainted(false);
//		btnCompreensivoTotal.setBorder(null);
//		btnCompreensivoTotal.setFocusPainted(false);
//		frame.getContentPane().add(btnCompreensivoTotal);
//
//		JButton btnPerdaTotalPor = new JButton("Perda Total Por Colisão");
//		btnPerdaTotalPor.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose(); // AÇÃO DO BOTÃO!
//			}
//		});
//		btnPerdaTotalPor.setForeground(Color.WHITE);
//		btnPerdaTotalPor.setFont(new Font("SansSerif", Font.PLAIN, 30));
//		btnPerdaTotalPor.setFocusPainted(false);
//		btnPerdaTotalPor.setBorderPainted(false);
//		btnPerdaTotalPor.setBorder(null);
//		btnPerdaTotalPor.setBackground(new Color(0, 103, 80));
//		btnPerdaTotalPor.setBounds(532, 438, 314, 148);
//		frame.getContentPane().add(btnPerdaTotalPor);
//
//
//
//		JButton btnRouboEFurto = new JButton("Roubo e Furto");
//		btnRouboEFurto.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose(); // AÇÃO DO BOTÃO!
//			}
//		});
//
//		btnRouboEFurto.setForeground(Color.WHITE);
//		btnRouboEFurto.setFont(new Font("SansSerif", Font.PLAIN, 30));
//		btnRouboEFurto.setFocusPainted(false);
//		btnRouboEFurto.setBorderPainted(false);
//		btnRouboEFurto.setBorder(null);
//		btnRouboEFurto.setBackground(new Color(0, 103, 80));
//		btnRouboEFurto.setBounds(976, 438, 314, 148);
//		frame.getContentPane().add(btnRouboEFurto);
//
//		// deixar em ultimo!!!!!!
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon(TelaEscolherSeguro.class.getResource("/TipoDeSeguro.png")));
//		lblNewLabel.setBounds(10, -152, 1884, 1092);
//		frame.getContentPane().add(lblNewLabel);
//		// deixar em todos
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//
//	}
//}
