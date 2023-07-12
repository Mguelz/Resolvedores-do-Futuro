package br.com.fiap.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.fiap.controller.ClienteController;
import br.com.fiap.controller.CotacaoFinal;
import br.com.fiap.controller.Dependente;
import br.com.fiap.controller.Ehkm0;
import br.com.fiap.controller.VeiculoController;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.VeiculoModel;

public class TelaCadastroDependente {

	public JFrame frame;
	public ClienteModel c8;
	public VeiculoModel v3;
	public ClienteController cc = new ClienteController();
	public VeiculoController vc = new VeiculoController();
	private double cotacaoCadastroDependente;
	private double cotacaoFinal;
	private double valorCarroSelecionado;
	private String seguroEscolhido;
	private String modeloSelecionado;

	/**
	 * Create the application.
	 */

	/**
	 * @wbp.parser.constructor
	 */
	public TelaCadastroDependente() {
		initialize();
	}

	public TelaCadastroDependente(ClienteModel c8, VeiculoModel v3, double cotacao, double valorCarroSelecionado,
			String seguroEscolhido, double cotacaoFinal,  String modeloSelecionado) {
		this.c8 = c8;
		this.v3 = v3;
		this.cotacaoCadastroDependente = cotacao;
		this.valorCarroSelecionado = valorCarroSelecionado;
		this.seguroEscolhido = seguroEscolhido;
		this.cotacaoFinal = cotacaoFinal;
		this.modeloSelecionado = modeloSelecionado;
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
		checkMasc.setBounds(153, 177, 60, 54); // Aumentar o tamanho para 50x50 pixels
		frame.getContentPane().add(checkMasc);

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		JCheckBox checkFem = new JCheckBox("");
		checkFem.setBackground(new Color(0, 103, 80));
		checkFem.setBounds(153, 360, 60, 54);
		frame.getContentPane().add(checkFem);

		JCheckBox checkNao = new JCheckBox("");
		checkNao.setBackground(new Color(0, 103, 80));
		checkNao.setBounds(153, 545, 60, 54);
		frame.getContentPane().add(checkNao);

		// cotacao dependente
		Dependente dp = new Dependente();
		if (checkNao.isSelected()) {
			cotacaoCadastroDependente += dp.aplicaTaxa("Não");
			System.out.println("nenhum dependente selecionado - cotacao " + cotacaoCadastroDependente + " return: "
					+ cotacaoCadastroDependente);
		} else if (checkMasc.isSelected()) {
			cotacaoCadastroDependente += dp.aplicaTaxa("Masculino");
			System.out.println("dependente M selecionado - cotacao " + cotacaoCadastroDependente + " return: "
					+ cotacaoCadastroDependente);
		}
		if (checkFem.isSelected()) {
			cotacaoCadastroDependente += dp.aplicaTaxa("Feminino");
			System.out.println("dependente F selecionado - cotacao " + cotacaoCadastroDependente + " return: "
					+ cotacaoCadastroDependente);
		}

		// cotacao final
		VeiculoModel vm = new VeiculoModel();
		vm.getFabricante();

		CotacaoFinal cf = new CotacaoFinal();
		cotacaoFinal = cf.cotacaoFinal(valorCarroSelecionado, cotacaoCadastroDependente);
		System.out.println("Cotacao Final - " + cotacaoFinal);

//		Ehkm0 km0 = new Ehkm0();
//		if (kmVeiculoSim.isSelected()) {
//			cotacaoDadosSeguro += km0.aplicaTaxaEh0Km("Sim");
//			System.out.println("Isensão Fiscal selecionado: Sim --> " + cotacaoDadosSeguro);
//		}

		JButton proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkFem.isSelected()) {
					c8.setDependente(1);
				} else if (checkNao.isSelected()) {
					c8.setDependente(2);
				} else {
					c8.setDependente(0);
				}

				System.out.println(c8.getCpf() + "||" + "||" + c8.getCorretorId());
				System.out.println(v3.getCpfCliente() + "||" + v3.getIdCliente() + "||" + v3.getNumeroChassi());
				cc.cadastrarCliente(c8);
				vc.cadastrarVeiculo(v3);
				TelaGerarApolice telaCadastro = new TelaGerarApolice(c8, v3, cotacaoCadastroDependente,
						valorCarroSelecionado, seguroEscolhido, cotacaoFinal, modeloSelecionado);
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
