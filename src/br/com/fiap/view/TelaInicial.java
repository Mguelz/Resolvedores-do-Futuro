
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
		
		
		
		JButton btnIniciarCotacao = new JButton("Iniciar Cotação");
		btnIniciarCotacao.setForeground(Color.WHITE);
		btnIniciarCotacao.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btnIniciarCotacao.setFocusPainted(false);
		btnIniciarCotacao.setBorderPainted(false);
		btnIniciarCotacao.setBorder(null);
		btnIniciarCotacao.setBackground(new Color(0, 103, 80));
		btnIniciarCotacao.setBounds(138, 528, 385, 111);
		frame.getContentPane().add(btnIniciarCotacao);
		
		

		ImageIcon image = new ImageIcon("LogoTokio.png"); //criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame
		
		

        btnIniciarCotacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastroUsuario2 telaCadastro = new TelaCadastroUsuario2();
                telaCadastro.frame.setVisible(true);
                frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
            }
        });
		
		
		
		
		
		
		
		
		
		//deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicial.class.getResource("/TelaInicial2.png")));
		lblNewLabel.setBounds(0, -206, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setLocationRelativeTo(null);
		
		
	}
}