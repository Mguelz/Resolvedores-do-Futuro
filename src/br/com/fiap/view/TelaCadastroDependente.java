package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCadastroDependente {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroDependente window = new TelaCadastroDependente();
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
	public TelaCadastroDependente() {
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

		ImageIcon image = new ImageIcon("LogoTokio.png"); // criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame

		JCheckBox checkMasc = new JCheckBox("");
		checkMasc.setBackground(new Color(0, 103, 80));
		checkMasc.setBounds(153, 224, 60, 54); // Aumentar o tamanho para 50x50 pixels
		frame.getContentPane().add(checkMasc);

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		JCheckBox checkFem = new JCheckBox("");
		checkFem.setBackground(new Color(0, 103, 80));
		checkFem.setBounds(153, 402, 60, 54);
		frame.getContentPane().add(checkFem);

		JCheckBox checkNao = new JCheckBox("");
		checkNao.setBackground(new Color(0, 103, 80));
		checkNao.setBounds(153, 583, 60, 54);
		frame.getContentPane().add(checkNao);

		JButton proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGerarApolice telaCadastro = new TelaGerarApolice();
				telaCadastro.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroDependente.class.getResource("/Seguro3.png")));
		lblNewLabel.setBounds(0, -166, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}
}
