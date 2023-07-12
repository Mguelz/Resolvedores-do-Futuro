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

import br.com.fiap.controller.ClienteController;
import br.com.fiap.controller.Estado;
import br.com.fiap.controller.EstadoCivil;
import br.com.fiap.controller.Genero;
import br.com.fiap.controller.TempoCnh;
import br.com.fiap.controller.UtilizacaoCarro;
import br.com.fiap.model.ClienteModel;

public class TelaCadastroUsuario {

	public JFrame frame;
	private ClienteModel c3;
	private double cotacaoCadastroUsuario;
	private double valorCarroSelecionado;
	private String seguroEscolhido;

	/**
	 * @wbp.parser.constructor
	 */
	public TelaCadastroUsuario(ClienteModel clienteModel, double cotacao, String seguroEscolhido) {
		this.c3 = clienteModel;
		this.seguroEscolhido = seguroEscolhido;
		System.out.println(c3);
		System.out.println(c3.getNomeCliente() + "/n" + c3.getEmail() + "/n" + c3.getSenhaCliente());

		// cotacao
		this.cotacaoCadastroUsuario = cotacao;

		initialize();
	}

	public TelaCadastroUsuario() {
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

		JComboBox<String> comboRegiao = new JComboBox<>();
		comboRegiao.setEditable(true);
		comboRegiao.setFont(new Font("Tahoma", Font.PLAIN, 30));

		comboRegiao.setSelectedItem("Selecione o estado"); // deixa um titulo na comboBox -- (selecione o editable no
															// painel propertis)
		comboRegiao.addItem("Acre");
		comboRegiao.addItem("Alagoas");
		comboRegiao.addItem("Amapá");
		comboRegiao.addItem("Amazonas");
		comboRegiao.addItem("Bahia");
		comboRegiao.addItem("Ceara");
		comboRegiao.addItem("Espírito Santo");
		comboRegiao.addItem("Goiás");
		comboRegiao.addItem("Maranhão");
		comboRegiao.addItem("Mato Grosso");
		comboRegiao.addItem("Mato Grosso Do Sul");
		comboRegiao.addItem("Minas Gerais");
		comboRegiao.addItem("Pará");
		comboRegiao.addItem("Paraíba");
		comboRegiao.addItem("Paraná");
		comboRegiao.addItem("Pernambuco");
		comboRegiao.addItem("Piauí");
		comboRegiao.addItem("Rio De Janeiro");
		comboRegiao.addItem("Rio Grande Do Norte");
		comboRegiao.addItem("Rio Grande Do Sul");
		comboRegiao.addItem("Rondônia");
		comboRegiao.addItem("Roraima");
		comboRegiao.addItem("Santa Catarina");
		comboRegiao.addItem("São Paulo");
		comboRegiao.addItem("Sergipe");
		comboRegiao.addItem("Tocantins");
		comboRegiao.addItem("Distrito Federal");

		// cotacao de estado
		String estadoSelecionado = (String) comboRegiao.getSelectedItem();
		Estado estadoController = new Estado();
		cotacaoCadastroUsuario += estadoController.aplicaTaxa(estadoSelecionado);
//		cotacaoCadastroUsuario = Double.parseDouble(estadoSelecionado);
		System.out.println("estado selecionado: " + estadoSelecionado + " - " + cotacaoCadastroUsuario);

		comboRegiao.setToolTipText("Tipo de utilização");
		comboRegiao.setForeground(new Color(0, 103, 80));
		comboRegiao.setBackground(new Color(255, 255, 255));
		comboRegiao.setBounds(100, 258, 344, 87);
		frame.getContentPane().add(comboRegiao);
		comboRegiao.setMaximumRowCount(3);

		comboRegiao.setUI(new BasicComboBoxUI() {
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

		JComboBox<String> comboSexo = new JComboBox<String>();
		comboSexo.setEditable(true);
		comboSexo.setToolTipText("Tipo de utilização");
		comboSexo.setForeground(new Color(0, 103, 80));
		comboSexo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboSexo.setBackground(Color.WHITE);
		comboSexo.setBounds(100, 483, 344, 87);
		frame.getContentPane().add(comboSexo);

		comboSexo.setUI(new BasicComboBoxUI() {
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

		comboSexo.setSelectedItem("Selecione o gênero"); // deixa um titulo na comboBox -- (selecione o editable no
															// painel propertis)
		comboSexo.addItem("Masculino");
		comboSexo.addItem("Feminino");
		comboSexo.addItem("Outros");
		comboSexo.addItem("Prefiro não Informar");

		// cotacao de genero
		String generoSelecionado = (String) comboRegiao.getSelectedItem();
		Genero ge = new Genero();
		cotacaoCadastroUsuario += ge.AplicaTaxaGenero(generoSelecionado);
		System.out.println("genero selecionado: " + generoSelecionado + " - " + cotacaoCadastroUsuario);

		JComboBox<String> comboEsCivil = new JComboBox<String>();
		comboEsCivil.setEditable(true);
		comboEsCivil.setToolTipText("Tipo de utilização");
		comboEsCivil.setForeground(new Color(0, 103, 80));
		comboEsCivil.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboEsCivil.setBackground(Color.WHITE);
		comboEsCivil.setBounds(594, 258, 344, 87);
		frame.getContentPane().add(comboEsCivil);

		comboEsCivil.setUI(new BasicComboBoxUI() {
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

		comboEsCivil.setSelectedItem("Estado Civil"); // deixa um titulo na comboBox -- (selecione o editable no painel
														// propertis)
		comboEsCivil.addItem("Casado(a)");
		comboEsCivil.addItem("Solteiro(a)");
		comboEsCivil.addItem("Viúvo(a)");
		comboEsCivil.addItem("Separado(a)");
		comboEsCivil.addItem("Divorciado(a)");
		comboEsCivil.addItem("União Estável");

		// cotacao de estado civil
		String estadoCivilSelecionado = (String) comboRegiao.getSelectedItem();
		EstadoCivil es = new EstadoCivil();
		cotacaoCadastroUsuario += es.aplicaTaxaEstadoCivil(estadoCivilSelecionado);
		System.out.println("estado civil: " + estadoCivilSelecionado + " - " + cotacaoCadastroUsuario);

		JComboBox<String> comboTempCnh = new JComboBox<String>();
		comboTempCnh.setEditable(true);
		comboTempCnh.setToolTipText("Tipo de utilização");
		comboTempCnh.setForeground(new Color(0, 103, 80));
		comboTempCnh.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboTempCnh.setBackground(Color.WHITE);
		comboTempCnh.setBounds(594, 483, 344, 87);
		frame.getContentPane().add(comboTempCnh);

		comboTempCnh.setSelectedItem("Tempo de CNH"); // deixa um titulo na comboBox -- (selecione o editable no painel
														// propertis)
		comboTempCnh.addItem("Menos de 2 anos");
		comboTempCnh.addItem("2 anos ou mais");

		// cotacao da utilizacao do carro
		String utilizacaoSelecionado = (String) comboTempCnh.getSelectedItem();
		TempoCnh tc = new TempoCnh();
		cotacaoCadastroUsuario += tc.aplicaTaxa(utilizacaoSelecionado);
		System.out.println("TempoCnhselecionado: " + utilizacaoSelecionado + " cotacao: " + cotacaoCadastroUsuario + " retorno - " + tc.aplicaTaxa(utilizacaoSelecionado));

		comboTempCnh.setUI(new BasicComboBoxUI() {
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
				ClienteController cc = new ClienteController();
				int tcnh;
				String tempCnh = (String) comboTempCnh.getSelectedItem();
				if (tempCnh.equals("2 anos ou mais")) {
					tcnh = 1;
				} else {
					tcnh = 0;
				}
				String estadoCivil = (String) comboEsCivil.getSelectedItem();
				String sexo = (String) comboSexo.getSelectedItem();
				if (sexo.equals("Masculino")) {
					sexo = "M";
				} else {
					sexo = "F";
				}
				String estado = (String) comboRegiao.getSelectedItem();
				// System.out.println(tempCnh+" "+ estadoCivil + " "+ sexo+" "+estado);

				c3.setEstado(estado);
				c3.setEstadoCivil(estadoCivil);
				c3.setGenero(sexo);
				c3.setTempoHabilitacao(tcnh);
//				c3.setCorretorId(1);
//				cc.cadastrarCliente(c3);
				TelaCadastroVeiculo telaCadastro = new TelaCadastroVeiculo(c3, cotacaoCadastroUsuario, valorCarroSelecionado, seguroEscolhido);
				telaCadastro.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroUsuario.class.getResource("/Usuario3.png")));
		lblNewLabel.setBounds(0, -166, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}
}
