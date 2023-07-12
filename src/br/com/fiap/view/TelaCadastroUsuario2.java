package br.com.fiap.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.fiap.model.ClienteModel;

public class TelaCadastroUsuario2 {

	JFrame frame;
	private JTextField digiteEmail;
	private JTextField digiteNome;
	private JButton proxPag;
	private JPasswordField digiteSenha;
	private ClienteModel c1 = new ClienteModel();
	private double cotacaoUsuario2;

	public TelaCadastroUsuario2(double cotacao) {
		this.cotacaoUsuario2 = cotacao;
		initialize();
	}

	public TelaCadastroUsuario2() {
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

		ImageIcon image = new ImageIcon("LogoTokio.png");
		frame.setIconImage(image.getImage());

		digiteEmail = new JTextField();
		digiteEmail.setBackground(new Color(244, 244, 244));
		digiteEmail.setText("Digite Aqui");
		digiteEmail.setBounds(192, 275, 341, 46);
		frame.getContentPane().add(digiteEmail);
		digiteEmail.setColumns(10);
		digiteEmail.setBorder(null);
		digiteEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));

		digiteNome = new JTextField();
		digiteNome.setText("Digite Aqui");
		digiteNome.setColumns(10);
		digiteNome.setBorder(null);
		digiteNome.setBackground(new Color(244, 244, 244));
		digiteNome.setBounds(808, 275, 341, 46);
		digiteNome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(digiteNome);

		digiteSenha = new JPasswordField();
		digiteSenha.setBounds(192, 545, 341, 46);
		digiteSenha.setText("Digite Aqui");
		digiteSenha.setColumns(10);
		digiteSenha.setBorder(null);
		digiteSenha.setBackground(new Color(244, 244, 244));
		digiteSenha.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(digiteSenha);

		proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = digiteNome.getText();
				String email = digiteEmail.getText();
				String senha = digiteSenha.getText();

				c1.setNomeCliente(nome);
				c1.setEmail(email);
				c1.setSenha(senha);
				TelaCadastroUsuario3 telaCadastro = new TelaCadastroUsuario3(c1, cotacaoUsuario2);
				telaCadastro.frame.setVisible(true);
//                TelaInicial.mt.salvar(nome, email, senha);
				frame.dispose();
			}
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroUsuario2.class.getResource("/Usuário.png")));
		lblNewLabel.setBounds(0, -165, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}
}