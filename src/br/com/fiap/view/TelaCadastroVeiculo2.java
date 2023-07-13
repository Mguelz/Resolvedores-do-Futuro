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

import br.com.fiap.controller.AnoDoCarro;
import br.com.fiap.controller.CorretorController;
import br.com.fiap.controller.ModeloCarro;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.VeiculoModel;

public class TelaCadastroVeiculo2 {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JComboBox<String> tipoUtilizacao;
	private JComboBox<String> comboAno;
	private ClienteModel c5;
	private VeiculoModel v2;
	private CorretorController cc;
	private double cotacaoVeiculo;
	private double valorCarroSelecionado;
	private String seguroEscolhido;
	private double cotacaoFinal;

	public TelaCadastroVeiculo2() {
		initialize();
	}

	public TelaCadastroVeiculo2(ClienteModel cliente, VeiculoModel veiculo, double cotacao,
			double valorCarroSelecionado,String seguroEscolhido) {
		this.c5 = cliente;
		this.v2 = veiculo;
		this.valorCarroSelecionado = valorCarroSelecionado;
		this.cotacaoVeiculo = cotacao;
		this.seguroEscolhido = seguroEscolhido;
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

		JComboBox<String> comboModelo = new JComboBox<String>();
		comboModelo.setEditable(true);
		comboModelo.setToolTipText("");
		comboModelo.setMaximumRowCount(3);
		comboModelo.setForeground(new Color(0, 103, 80));
		comboModelo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboModelo.setBackground(new Color(255, 255, 255));
		comboModelo.setBounds(98, 263, 344, 87);
		frame.getContentPane().add(comboModelo);
		comboModelo.setSelectedItem("Selecione o modelo"); // deixa um titulo na comboBox -- (selecione o editable no
															// painel propertis)

		JComboBox<String> comboAno = new JComboBox<String>();
		comboAno.setEditable(true);
		comboAno.setToolTipText("Tipo de utilização");
		comboAno.setMaximumRowCount(3);
		comboAno.setForeground(new Color(0, 103, 80));
		comboAno.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboAno.setBackground(new Color(255, 255, 255));
		comboAno.setBounds(98, 488, 344, 87);
		frame.getContentPane().add(comboAno);
		comboAno.setSelectedItem("Selecione o ano"); // deixa um titulo na comboBox -- (selecione o editable no painel
														// propertis)

		comboAno.addItem("2023");
		comboAno.addItem("2022");
		comboAno.addItem("2021");
		comboAno.addItem("2020");
		comboAno.addItem("2019");
		comboAno.addItem("2018");
		comboAno.addItem("2017");
		comboAno.addItem("2016");
		comboAno.addItem("2015");
		comboAno.addItem("2014");
		comboAno.addItem("2013");
		comboAno.addItem("2012");
		comboAno.addItem("2011");
		comboAno.addItem("2010");
		comboAno.addItem("2009");
		comboAno.addItem("2008");
		comboAno.addItem("2007");
		comboAno.addItem("2006");
		comboAno.addItem("2005");
		comboAno.addItem("2004");
		comboAno.addItem("2003");
		comboAno.addItem("2002");
		comboAno.addItem("2001");
		comboAno.addItem("2000");
		// cotacar do ano do carro
		// nao esta puxando o ano certo, sempre cai no else
		String anoCarroSelecionado = (String) comboAno.getSelectedItem(); // .toString();
		AnoDoCarro ac = new AnoDoCarro();
		cotacaoVeiculo += ac.aplicaTaxaAnoDoCarro(anoCarroSelecionado); // sempre vai na opcao else (nao esta comparando
																		// as strings)
		System.out.println(anoCarroSelecionado + " || " + comboAno.getSelectedItem());
		System.out.println("ano selecionado: " + anoCarroSelecionado + " - cotacao = " + cotacaoVeiculo + " retorno = "
				+ ac.aplicaTaxaAnoDoCarro(anoCarroSelecionado));

		// alguns comentados para que a comboBox fique menor
		// nao tem nenhuma logica em cima dos modelos dos carros (a logica ja esta no
		// fabricante)
		comboModelo.addItem("Accent");
		comboModelo.addItem("Amarok");
		comboModelo.addItem("Argo");
//		comboModelo.addItem("Camaro");
//		comboModelo.addItem("Camry");
		comboModelo.addItem("Corolla");
		comboModelo.addItem("Corsa");
		comboModelo.addItem("Creta");
		comboModelo.addItem("Cronos");
		comboModelo.addItem("Cruze");
		comboModelo.addItem("Elantra");
		comboModelo.addItem("Fusca");
		comboModelo.addItem("Gol");
		comboModelo.addItem("HB20");
		comboModelo.addItem("Hillux");
		comboModelo.addItem("Jetta");
		comboModelo.addItem("Onix");
		comboModelo.addItem("Palio");
		comboModelo.addItem("Polo");
//		comboModelo.addItem("RAV4");
		comboModelo.addItem("Silverado");
		comboModelo.addItem("Strada");
//		comboModelo.addItem("Tucson");
		comboModelo.addItem("Uno");
//		comboModelo.addItem("Yaris");
		
		
		
		// cotacao da marca do veiculo
//				String marcaSelecionada = (String) comboMarca.getSelectedItem();
//				ModeloCarro mc = new ModeloCarro();
//				valorCarroSelecionado = mc.aplicaTaxaModeloCarro(marcaSelecionada);
//				System.out.println("marca selecionado: " + marcaSelecionada + " - " + valorCarroSelecionado);
		
		
		
		String modeloSelecionado = (String) comboModelo.getSelectedItem();
		
		
		
		
		
		
		

		JComboBox<String> comboCorretor = new JComboBox<String>();
		comboCorretor.setEditable(true);
		comboCorretor.setToolTipText("Tipo de utilização");
		comboCorretor.setMaximumRowCount(3);
		comboCorretor.setForeground(new Color(0, 103, 80));
		comboCorretor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboCorretor.setBackground(new Color(255, 255, 255));
		comboCorretor.setBounds(587, 263, 344, 87);
		frame.getContentPane().add(comboCorretor);
		comboCorretor.setSelectedItem("Escolha o corretor"); // deixa um titulo na comboBox -- (selecione o editable no
																// painel propertis)

		// nao tem nenhuma logica de cotacao em cima dos corretores
		comboCorretor.addItem("Márcio R.- SP");
		comboCorretor.addItem("Ana S.- RJ");

		JComboBox<String> comboCombustivel = new JComboBox<String>();
		comboCombustivel.setEditable(true);
		comboCombustivel.setToolTipText("Tipo de utilização");
		comboCombustivel.setMaximumRowCount(3);
		comboCombustivel.setForeground(new Color(0, 103, 80));
		comboCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboCombustivel.setBackground(new Color(255, 255, 255));
		comboCombustivel.setBounds(587, 488, 344, 87);
		frame.getContentPane().add(comboCombustivel);
		comboCombustivel.setSelectedItem("Tipo combustivel"); // deixa um titulo na comboBox -- (selecione o editable no
																// painel propertis)

		comboCombustivel.addItem("Gasolina");
		comboCombustivel.addItem("Alcool");
		comboCombustivel.addItem("Flex");
		comboCombustivel.addItem("Diesel");

		comboModelo.setUI(new BasicComboBoxUI() {
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

		comboAno.setUI(new BasicComboBoxUI() {
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

		comboCorretor.setUI(new BasicComboBoxUI() {
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

		comboCombustivel.setUI(new BasicComboBoxUI() {
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

		JButton proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int corretor2 = 1;
				String combustivel = (String) comboCombustivel.getSelectedItem();
				String ano = (String) comboAno.getSelectedItem();
				String modelo = (String) comboModelo.getSelectedItem();
				String corretor = (String) comboCorretor.getSelectedItem();
				if (corretor.equals("Márcio R.- SP")) {
					corretor2 = 1;
				} else {
					corretor2 = 2;
				}
				v2.setCombustivel(combustivel);
				v2.setDataFabricacao(ano);
				v2.setModelo(modelo);
				c5.setCorretorId(corretor2);
				v2.setIdCliente(c5.getCorretorId());
				System.out.println(c5.getCorretorId());
				TelaDadosSeguro telaCadastro = new TelaDadosSeguro(v2, c5, cotacaoVeiculo, valorCarroSelecionado, seguroEscolhido, cotacaoFinal,modeloSelecionado);
				telaCadastro.frame.setVisible(true);

				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		// deixar em todos

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroVeiculo2.class.getResource("/Veiculo2.png")));
		lblNewLabel.setBounds(0, -166, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}
}
