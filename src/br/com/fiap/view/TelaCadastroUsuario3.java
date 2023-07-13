package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.fiap.model.ClienteModel;

public class TelaCadastroUsuario3 {

	public JFrame frame;
	private JTextField digiteCelular;
	private JTextField digiteCpf;
	private JTextField digiteDataNasc;
	private JButton proxPag;
	String formato = "dd/MM/yyyy";
	String dataString;
	private ClienteModel c2;
	private double cotacaoUsuario3;
	private String seguroEscolhido;
	/**
	 * Create the application.
	 * 
	 */
	public TelaCadastroUsuario3(ClienteModel clienteModel, double cotacao, String seguroEscolhido) {
		this.c2 = clienteModel;
		this.cotacaoUsuario3 = cotacao;
		this.seguroEscolhido = seguroEscolhido;
		initialize();
	}

	public TelaCadastroUsuario3() {
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

		digiteCelular = new JTextField();
		digiteCelular.setBackground(new Color(244, 244, 244));
		digiteCelular.setText("Digite Aqui");
		digiteCelular.setBounds(219, 270, 355, 46);
		frame.getContentPane().add(digiteCelular);
		digiteCelular.setColumns(10);
		digiteCelular.setBorder(null);
		digiteCelular.setFont(new Font("Tahoma", Font.PLAIN, 25));

		digiteCpf = new JTextField();
		digiteCpf.setText("Digite Aqui");
		digiteCpf.setColumns(10);
		digiteCpf.setBorder(null);
		digiteCpf.setBackground(new Color(244, 244, 244));
		digiteCpf.setBounds(219, 538, 341, 46);
		frame.getContentPane().add(digiteCpf);
		digiteCpf.setFont(new Font("Tahoma", Font.PLAIN, 25));

		digiteDataNasc = new JTextField();
		digiteDataNasc.setText("DD / MM / AAAA");
		digiteDataNasc.setColumns(10);
		digiteDataNasc.setBorder(null);
		digiteDataNasc.setBackground(new Color(244, 244, 244));
		digiteDataNasc.setBounds(814, 270, 341, 46);
		frame.getContentPane().add(digiteDataNasc);
		digiteDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 25));

		proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pega os dados
				String cpf = new String(digiteCpf.getText());
				String dataNascimento = new String(digiteDataNasc.getText());
				String celular = new String(digiteCelular.getText());
				System.out.println(celular);
				System.out.println("CPF: " + cpf + " Celular: " + celular + " Data de nascimento: " + dataNascimento);
				//Bloco de conversão de data
				dataString = digiteDataNasc.getText();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
				LocalDate data = LocalDate.parse(dataString, formatter);
				System.out.println("Data convertida: " + data);
				Date dataSql = Date.valueOf(data);
				System.out.println("Data SQL: " + dataSql);
				//Fim do bloco
				
				//Salva as variáveis abaixo.
				c2.setCpf(Long.parseLong(cpf));
				c2.setDataNascimento(dataSql);
				c2.setCelularCliente(celular);
				TelaCadastroUsuario telaCadastro = new TelaCadastroUsuario(c2, cotacaoUsuario3, seguroEscolhido);
				telaCadastro.frame.setVisible(true);

				//System.out.println(nome+senha+email);
				// ModeloTemporario telaModelo = new ModeloTemporario(nome, email, senha, cpf,
				// celular,dataSql);
				// telaModelo.executar();
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroUsuario3.class.getResource("/Usuario2.png")));
		lblNewLabel.setBounds(0, -165, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

	private void adicionarIcone(JButton proxPag) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		proxPag.setIcon(icon);
	}
	
}