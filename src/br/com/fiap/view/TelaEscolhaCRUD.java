
package br.com.fiap.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaEscolhaCRUD {

	public JFrame frame;

	
	/**
	 * Create the application.
	 */
	public TelaEscolhaCRUD() throws SQLException{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws SQLException{
		frame = new JFrame();
		frame.setBounds(100, 100, 1363, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		ImageIcon image = new ImageIcon("LogoTokio.png"); // criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame

		
		JButton btnCVisualizarDados = new JButton("Visualizar Dados");
		btnCVisualizarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				String buttonText = source.getText();
				System.out.println(buttonText);
				TelaReadCRUD telaRead;
				telaRead = new TelaReadCRUD();
				telaRead.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		btnCVisualizarDados.setFont(new Font("SansSerif", Font.PLAIN, 30));
		btnCVisualizarDados.setBackground(new Color(0, 103, 80));
		btnCVisualizarDados.setForeground(Color.WHITE);
		btnCVisualizarDados.setBounds(274, 462, 316, 148);
		btnCVisualizarDados.setBorderPainted(false);
		btnCVisualizarDados.setBorder(null);
		btnCVisualizarDados.setFocusPainted(false);
		frame.getContentPane().add(btnCVisualizarDados);
		
		

	
		
		
		JButton btnAtualizarDados = new JButton("Atualizar Dados");
		btnAtualizarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				String buttonText = source.getText();
				System.out.println(buttonText);

				TelaUpdateCRUD telaUpdate = new TelaUpdateCRUD();
				telaUpdate.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		btnAtualizarDados.setForeground(Color.WHITE);
		btnAtualizarDados.setFont(new Font("SansSerif", Font.PLAIN, 30));
		btnAtualizarDados.setFocusPainted(false);
		btnAtualizarDados.setBorderPainted(false);
		btnAtualizarDados.setBorder(null);
		btnAtualizarDados.setBackground(new Color(0, 103, 80));
		btnAtualizarDados.setBounds(798, 462, 314, 148);
		frame.getContentPane().add(btnAtualizarDados);

		// System.out.println(tipoSeguro);

		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaEscolhaCRUD.class.getResource("/EscolhaCRUD.png")));
		lblNewLabel.setBounds(10, -152, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

	
}
