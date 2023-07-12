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
import javax.swing.LookAndFeel;
import javax.swing.plaf.basic.BasicComboBoxUI;

import br.com.fiap.controller.Garagem;
import br.com.fiap.controller.UtilizacaoCarro;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.VeiculoModel;

public class TelaCadastroSeguro {

	public JFrame frame;
	public VeiculoModel v3;
	public ClienteModel c7;
	private double cotacaoCadastroSeguro;
	private double valorCarroSelecionado;
	private String seguroEscolhido;
	private double cotacaoFinal;
	private String modeloSelecionado;

	public TelaCadastroSeguro(VeiculoModel v3, ClienteModel c7, double cotacao, double valorCarroSelecionado, String seguroEscolhido, String modeloSelecionado) {
		this.v3 = v3;
		this.c7 = c7;
		this.cotacaoCadastroSeguro = cotacao;
		this.valorCarroSelecionado = valorCarroSelecionado;
		this.seguroEscolhido = seguroEscolhido;
		this.modeloSelecionado = modeloSelecionado;
		initialize();
	}

	public TelaCadastroSeguro() {
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

		JComboBox<String> tipoUtilizacao = new JComboBox<>();
		tipoUtilizacao.setEditable(true);
		tipoUtilizacao.setFont(new Font("Tahoma", Font.PLAIN, 25));

		tipoUtilizacao.addItem("Locomoção diária");
		tipoUtilizacao.addItem("Locomoção até o trabalho");
		tipoUtilizacao.addItem("Motorista de aplicativo");
		tipoUtilizacao.addItem("Motorista de táxi");
		tipoUtilizacao.addItem("PCD - Locomoção diária");
		tipoUtilizacao.addItem("PCD - Exercício de trabalho");
		// comboBox.getFont();

		// cotacao da utilizacao do carro
		String utilizacaoSelecionado = (String) tipoUtilizacao.getSelectedItem();
		UtilizacaoCarro uc = new UtilizacaoCarro();
		cotacaoCadastroSeguro += uc.aplicaTaxaUtilizacaoCarro(utilizacaoSelecionado);
		System.out.println("utilizacao selecionado: " + utilizacaoSelecionado + " cotacao: " + cotacaoCadastroSeguro
				+ " retorno - " + uc.aplicaTaxaUtilizacaoCarro(utilizacaoSelecionado));

		tipoUtilizacao.setToolTipText("Tipo de utilização");
		tipoUtilizacao.setForeground(new Color(0, 103, 80));
		tipoUtilizacao.setBackground(new Color(255, 255, 255));
		tipoUtilizacao.setBounds(198, 261, 398, 87);
		tipoUtilizacao.setSelectedItem("Tipo de utilização");
		tipoUtilizacao.setMaximumRowCount(3);
		frame.getContentPane().add(tipoUtilizacao);

		JComboBox<String> garagem = new JComboBox<String>();
		garagem.setEditable(true);
		garagem.setFont(new Font("Tahoma", Font.PLAIN, 23));
		garagem.setToolTipText("");
		garagem.setForeground(new Color(0, 103, 80));
		garagem.setBackground(new Color(255, 255, 255));
		garagem.setBounds(198, 519, 398, 87);
		garagem.setSelectedItem("Selecione a garagem");
		garagem.setMaximumRowCount(3);
		frame.getContentPane().add(garagem);

		tipoUtilizacao.setUI(new BasicComboBoxUI() {
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
		///

		garagem.setUI(new BasicComboBoxUI() {
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

		garagem.addItem("Exclusivamente na residência");
		garagem.addItem("Exclusivamente no trabalho");
		garagem.addItem("Residência e trabalho");
		garagem.addItem("Garagem paga");
		garagem.addItem("Não possuo");

		// cotacao de garagem
		String garagemSelecionado = (String) garagem.getSelectedItem();
		Garagem ga = new Garagem();
		cotacaoCadastroSeguro += ga.AplicaTaxaGaragem(garagemSelecionado);
		System.out.println("garagem selecionada: " + garagemSelecionado + " cotacao: " + cotacaoCadastroSeguro
				+ " return " + ga.AplicaTaxaGaragem(garagemSelecionado));

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				byte tipoGaragem;
				String tpGaragem = (String) garagem.getSelectedItem();
				if (tpGaragem.equals("Exclusivamente na residência")) {
					tipoGaragem = 4;
				} else if (tpGaragem.equals("Exclusivamente no trabalho")) {
					tipoGaragem = 3;
				} else if (tpGaragem.equals("Residência e trabalho")) {
					tipoGaragem = 2;
				} else if (tpGaragem.equals("Garagem paga")) {
					tipoGaragem = 1;
				} else {
					tipoGaragem = 0;
				}
				String tpUtilizacao = (String) tipoUtilizacao.getSelectedItem();

				v3.setGaragem(tipoGaragem);
				v3.setUtilizacao(tpUtilizacao);
				TelaCadastroDependente telaCadastro = new TelaCadastroDependente(c7, v3, cotacaoCadastroSeguro, valorCarroSelecionado, seguroEscolhido, cotacaoFinal, modeloSelecionado);
				telaCadastro.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroSeguro.class.getResource("/Seguro2.png")));
		lblNewLabel.setBounds(0, -162, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}
}
