
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

public class TelaMensagemFinal {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMensagemFinal window = new TelaMensagemFinal();
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
	public TelaMensagemFinal() {
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
		
		ImageIcon image = new ImageIcon("LogoTokio.png"); //criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame
		
		
		
		
		//deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaMensagemFinal.class.getResource("/Mensagem final.png")));
		lblNewLabel.setBounds(0, -206, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setLocationRelativeTo(null);
		
		
	}
}