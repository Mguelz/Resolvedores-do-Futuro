package br.com.fiap.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import br.com.fiap.controller.Ehkm0;
import br.com.fiap.controller.KitGasController;
import br.com.fiap.controller.IsencaoFiscal;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.VeiculoModel;

public class TelaDadosSeguro {

	public JFrame frame;
	public VeiculoModel v2;
	public ClienteModel c6;
	private double cotacaoDadosSeguro;
	private boolean seila;
	private double valorCarroSelecionado;

	/**
	 * Create the application.
	 */
	public TelaDadosSeguro() {
		initialize();
	}

	public TelaDadosSeguro(VeiculoModel v2, ClienteModel c6, double cotacao, double valorCarroSelecionado) {
		this.v2 = v2;
		this.c6 = c6;
		this.cotacaoDadosSeguro = cotacao;
		this.valorCarroSelecionado = valorCarroSelecionado;
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

		JRadioButton kmVeiculoSim = new JRadioButton("");
		kmVeiculoSim.setBackground(new Color(0, 103, 80));
		kmVeiculoSim.setBounds(652, 239, 34, 64);
		frame.getContentPane().add(kmVeiculoSim);

		JRadioButton kmVeiculoNao = new JRadioButton("");
		kmVeiculoNao.setBackground(new Color(0, 103, 80));
		kmVeiculoNao.setBounds(787, 244, 34, 59);
		frame.getContentPane().add(kmVeiculoNao);

		kmVeiculoNao.getSize();

		ButtonGroup kmVeiculo = new ButtonGroup();
		kmVeiculo.add(kmVeiculoSim);
		kmVeiculo.add(kmVeiculoNao);

		JRadioButton isFiscalSim = new JRadioButton("");
		isFiscalSim.setBackground(new Color(0, 103, 80));
		isFiscalSim.setBounds(652, 405, 34, 64);
		frame.getContentPane().add(isFiscalSim);

		JRadioButton isFiscalNao = new JRadioButton("");
		isFiscalNao.setBackground(new Color(0, 103, 80));
		isFiscalNao.setBounds(787, 410, 34, 59);
		frame.getContentPane().add(isFiscalNao);

		ButtonGroup isFiscal = new ButtonGroup();
		isFiscal.add(isFiscalSim);
		isFiscal.add(isFiscalNao);

		JRadioButton kitGasSim = new JRadioButton("");
		kitGasSim.setBackground(new Color(0, 103, 80));
		kitGasSim.setBounds(652, 577, 34, 64);
		frame.getContentPane().add(kitGasSim);

		JRadioButton kitGasNao = new JRadioButton("");
		kitGasNao.setBackground(new Color(0, 103, 80));
		kitGasNao.setBounds(787, 582, 34, 59);
		frame.getContentPane().add(kitGasNao);

		ButtonGroup kitGas = new ButtonGroup();
		kitGas.add(kitGasSim);
		kitGas.add(kitGasNao);

		JButton proxPag = new JButton("New button");
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		proxPag.setBorderPainted(false);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		// cotacao de carro 0 km
//		Ehkm0 km0 = new Ehkm0();
		if (kmVeiculoSim.isSelected()) {
			cotacaoDadosSeguro += 0.004;
			System.out.println("Isensão Fiscal selecionado: Sim --> " + cotacaoDadosSeguro);
		}
		if (kmVeiculoNao.isSelected()) {
			cotacaoDadosSeguro += 0.001;
			System.out.println("Isensão selecionado: Não  --> " + cotacaoDadosSeguro);
		}

		// cotacao de isensao fiscal
		IsencaoFiscal pif = new IsencaoFiscal();
		if (isFiscalSim.isSelected()) {
			cotacaoDadosSeguro += pif.aplicaTaxaIsencaiFiscal("Sim");
			System.out.println("Isensão Fiscal selecionado: Sim --> " + cotacaoDadosSeguro);
		}
		if (isFiscalNao.isSelected()) {
			cotacaoDadosSeguro += pif.aplicaTaxaIsencaiFiscal("Não");
			System.out.println("Isensão selecionado: Não  --> " + cotacaoDadosSeguro);
		}

		// cotacao do kitgas
		// esta sempre pegando nao
		KitGasController kgc = new KitGasController();
		if (kitGasSim.isSelected()) {
			cotacaoDadosSeguro += kgc.aplicaTaxa("Sim");
			System.out.println("kitgas selecionado: Sim --> " + cotacaoDadosSeguro);
		}
		if (kitGasNao.isSelected()) {
			cotacaoDadosSeguro += kgc.aplicaTaxa("Não");
			System.out.println("kitgas selecionado: Não  --> " + cotacaoDadosSeguro);
		}

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (kmVeiculoSim.isSelected()) {
					v2.setCarroZero(true);
				} else {
					v2.setCarroZero(false);
				}
				;
				if (isFiscalSim.isSelected()) {
					v2.setIsencao(true);
				} else {
					v2.setIsencao(false);
				}
				;
				if (kitGasSim.isSelected()) {
					v2.setKitgas(true);
				} else {
					v2.setKitgas(false);
				}

				TelaCadastroSeguro telaCadastro = new TelaCadastroSeguro(v2, c6, cotacaoDadosSeguro, valorCarroSelecionado);
				telaCadastro.frame.setVisible(true);

				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaDadosSeguro.class.getResource("/Seguro.png")));
		lblNewLabel.setBounds(0, -162, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

//		  ActionListener radioListener = new ActionListener() {
//	            public void actionPerformed(ActionEvent e) {
////	                JRadioButton source = (JRadioButton) e.getSource();
//	                if (kmVeiculoSim.isSelected()) {
//			            System.out.println("E 0 KM");
//			        } else {
//			            System.out.println("Nao e 0 KM");
//			        }
//				 
//				 if (isFiscalSim.isSelected()) {
//			            System.out.println("Possui isencao fiscal");
//			        } else {
//			            System.out.println("Nao possui isencao fiscal");
//			        }
//				 
//				 
//				 if (kitGasSim.isSelected()) {
//			            System.out.println("Possui kit gas");
//			        } else {
//			            System.out.println("Nao possui kit gas");
//			        }
//	            }
//	        };

//		
//	        kmVeiculoSim.addActionListener(radioListener);
//	        kmVeiculoNao.addActionListener(radioListener);
//	        isFiscalSim.addActionListener(radioListener);
//	        isFiscalNao.addActionListener(radioListener);
//	        kitGasSim.addActionListener(radioListener);
//	        kitGasNao.addActionListener(radioListener);

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}

}
