package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.VeiculoModel;

import javax.swing.JTextField;
import java.awt.Font;

public class TelaGerarApolice {
	public JFrame frame;
	private String nomeCliente;
	private JTextField nome;
	private ClienteModel c8; // pega os atributos do cliente
	private VeiculoModel v3; // pega os atributos do veiculo
	private double cotacao; // pega a cotacao em porcentagem
	private double valorCarroSelecionado; // pega o valor do carro escolhido
	private String seguroEscolhido; // pega o seguro escolhido
	private JTextField nomeSeguro;
	private String nomeC;
	private JTextField valorFinal;
	private double cotacaoFinal;
	private String modeloSelecionado;
	private JTextField modeloVeic;

	public TelaGerarApolice(ClienteModel c8, VeiculoModel v3, double cotacao, double valorCarroSelecionado,
			String seguroEscolhido, double cotacaoFinal,  String modeloSelecionado) {
		this.c8 =c8;
		this.v3 = v3;
		this.cotacao = cotacao;
		this.valorCarroSelecionado = valorCarroSelecionado;
		this.cotacaoFinal = cotacaoFinal;
		this.seguroEscolhido = seguroEscolhido;
		this.modeloSelecionado = modeloSelecionado;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		ImageIcon image = new ImageIcon("LogoTokio.png"); // criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame

//		JButton btnGerarApolice = new JButton("New button");
//		btnGerarApolice.setBackground(new Color(244, 244, 244));
//		btnGerarApolice.setForeground(new Color(244, 244, 244));
//		btnGerarApolice.setBounds(689, 188, 113, 108);
//		btnGerarApolice.setBorderPainted(false);
//		adicionarIcone(btnGerarApolice); // Adicionar o ícone ao botão
//		frame.getContentPane().add(btnGerarApolice);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//
//		JButton btnGerarCarteirinha = new JButton("New button");
//		btnGerarCarteirinha.setForeground(new Color(244, 244, 244));
//		btnGerarCarteirinha.setBorderPainted(false);
//		btnGerarCarteirinha.setBackground(new Color(244, 244, 244));
//		adicionarIcone(btnGerarCarteirinha);
//		btnGerarCarteirinha.setBounds(689, 510, 113, 108);
//		frame.getContentPane().add(btnGerarCarteirinha);

		JButton proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(244, 244, 244));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone1(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMensagemFinal telaCadastro = new TelaMensagemFinal();
				telaCadastro.frame.setVisible(true);
				
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});
		nome = new JTextField();
		nome.setForeground(new Color(244, 162, 36));
		nome.setBorder(null);
		nome.setFont(new Font("Tahoma", Font.PLAIN, 35));
		nome.setBackground(new Color(0, 103, 80));
		nome.setText("aaaa");
		nome.setBounds(246, 35, 345, 42);
		frame.getContentPane().add(nome);
		nome.setColumns(10);
		
		nomeC=c8.getNomeCliente();
		System.out.println(c8.getNomeCliente());
		
		nome.setText(nomeC);
		
		
		String valor1 = String.valueOf(cotacaoFinal);
		
		
		// pegar nomeCliente
		c8.getNomeCliente();
		
		
		nomeSeguro = new JTextField();
		nomeSeguro.setForeground(new Color(244, 162, 36));
		nomeSeguro.setText(seguroEscolhido);
		nomeSeguro.setFont(new Font("Tahoma", Font.PLAIN, 35));
		nomeSeguro.setColumns(10);
		nomeSeguro.setBorder(null);
		nomeSeguro.setBackground(new Color(0, 103, 80));
		nomeSeguro.setBounds(154, 258, 367, 48);
		frame.getContentPane().add(nomeSeguro);
		nomeSeguro.setText(seguroEscolhido);

		valorFinal = new JTextField();
		valorFinal.setForeground(new Color(244, 162, 36));
		valorFinal.setFont(new Font("Tahoma", Font.PLAIN, 35));
		valorFinal.setColumns(10);
		valorFinal.setBorder(null);
		valorFinal.setBackground(new Color(0, 103, 80));
		valorFinal.setBounds(154, 483, 345, 48);
		frame.getContentPane().add(valorFinal);
		
		
	DecimalFormat format = new DecimalFormat("#.##");
		valorFinal.setText("R$: " + format.format(cotacaoFinal));
		
		modeloVeic = new JTextField();
		modeloVeic.setForeground(new Color(244, 162, 36));
		modeloVeic.setText("");
		modeloVeic.setFont(new Font("Tahoma", Font.PLAIN, 35));
		modeloVeic.setColumns(10);
		modeloVeic.setBorder(null);
		modeloVeic.setBackground(new Color(0, 103, 80));
		modeloVeic.setBounds(154, 347, 345, 48);
		frame.getContentPane().add(modeloVeic);
		
		modeloVeic.setText(modeloSelecionado);
		
		
		// Deixar em último
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon(TelaGerarApolice.class.getResource("/Mensagem1.png")));
		lblNewLabel.setBounds(0, -206, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		
		
		

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("seta.png"));
		btnNewButton.setIcon(icon);
	}

	private void adicionarIcone1(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVerde.png"));
		btnNewButton.setIcon(icon);
	}
}