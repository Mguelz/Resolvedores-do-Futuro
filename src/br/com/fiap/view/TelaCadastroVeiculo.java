package br.com.fiap.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.plaf.basic.BasicComboBoxUI;

import br.com.fiap.controller.ModeloCarro;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.VeiculoModel;

public class TelaCadastroVeiculo {

	public JFrame frame;
	private JTextField digitePlaca;
	private JTextField digiteChassi;
	private JComboBox<String> tipoUtilizacao;
	private JComboBox<String> comboMarca;
	private JButton proxPag;
	private ClienteModel c4;
	private VeiculoModel v1 = new VeiculoModel();
	private double cotacaoVeiculo;

	/**
	 * Create the application.
	 */
	public TelaCadastroVeiculo(ClienteModel cliente, double cotacaoVeiculo) {
		this.c4 = cliente;
		this.cotacaoVeiculo = cotacaoVeiculo;
		initialize();
	}

	public TelaCadastroVeiculo() {
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

		digitePlaca = new JTextField();
		digitePlaca.setText("Digite Aqui");
		digitePlaca.setColumns(10);
		digitePlaca.setBorder(null);
		digitePlaca.setBackground(new Color(244, 244, 244));
		digitePlaca.setBounds(199, 279, 341, 46);
		digitePlaca.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(digitePlaca);

		digiteChassi = new JTextField();
		digiteChassi.setText("Digite Aqui");
		digiteChassi.setColumns(10);
		digiteChassi.setBorder(null);
		digiteChassi.setBackground(new Color(244, 244, 244));
		digiteChassi.setBounds(835, 279, 341, 46);
		digiteChassi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(digiteChassi);

		comboMarca = new JComboBox<String>();
		comboMarca.setToolTipText("Marca do veiculo");
		comboMarca.setMaximumRowCount(3);
		comboMarca.setForeground(new Color(0, 103, 80));
		comboMarca.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboMarca.setBackground(new Color(244, 244, 244));
		comboMarca.setBounds(183, 522, 344, 87);
		frame.getContentPane().add(comboMarca);

		comboMarca.addItem("Fiat");
		comboMarca.addItem("Toyota");
		comboMarca.addItem("Chevrolet");
		comboMarca.addItem("Hyundai");
		comboMarca.addItem("Volkswagen");

		// cotacao da marca do veiculo
		String marcaSelecionada = (String) comboMarca.getSelectedItem();
		ModeloCarro mc = new ModeloCarro();
		double valorCarroSelecionado = mc.aplicaTaxaModeloCarro(marcaSelecionada);
		System.out.println("marca selecionado: " + marcaSelecionada + " - " + valorCarroSelecionado);

		comboMarca.setUI(new BasicComboBoxUI() {
			@Override
			protected JButton createArrowButton() {
				JButton button = new JButton();
				button.setBorder(BorderFactory.createEmptyBorder());
				button.setContentAreaFilled(false);
				button.setFocusPainted(false);
				button.setIcon(new ImageIcon("arrow_icon.png")); // Substitua pelo ícone da seta desejado
				return button;
			}

			@Override
			protected void installDefaults() {
				super.installDefaults();
				LookAndFeel.uninstallBorder(comboBox);
			}

			@Override
			public void configureArrowButton() {
				super.configureArrowButton();
				arrowButton.setVisible(true);
			}
		});

		proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String placa = new String(digitePlaca.getText());
				String chassi = new String(digiteChassi.getText());
				String marca = (String) (comboMarca.getSelectedItem());
				System.out.println(marca);
				v1.setNumeroChassi(chassi);
				v1.setPlaca(placa);
				v1.setFabricante(marca);
				System.out.println(c4.getCpf());
				v1.setCpfCliente(c4.getCpf());
				System.out.println(v1.getCpfCliente());
				TelaCadastroVeiculo2 telaCadastro = new TelaCadastroVeiculo2(c4, v1, cotacaoVeiculo);
				telaCadastro.frame.setVisible(true);
				System.out.println("Placa:  " + placa + " Numero Chassi: " + chassi);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		// deixar em todos

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroVeiculo.class.getResource("/Veiculo.png")));
		lblNewLabel.setBounds(0, -166, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}

}
