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

public class TelaInicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
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
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JButton btnNewButton = new JButton("Iniciar Cotação");
		        btnNewButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                frame.dispose(); // fechar a janela atual
		            }
		        });
		        btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 30));
		        btnNewButton.setBackground(new Color(0, 51, 51));
		        btnNewButton.setForeground(Color.WHITE);
		        btnNewButton.setBounds(161, 516, 365, 103);
		        frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
		
		//deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicial.class.getResource("/TelaInicial2.png")));
		lblNewLabel.setBounds(10, -62, 1350, 800);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
