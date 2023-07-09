package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaDadosSeguro {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDadosSeguro window = new TelaDadosSeguro();
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
	public TelaDadosSeguro() {
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

		JRadioButton kmVeiculoSim = new JRadioButton("É 0 KM");
		kmVeiculoSim.setBackground(new Color(0, 103, 80));
		kmVeiculoSim.setBounds(652, 239, 34, 64);
		frame.getContentPane().add(kmVeiculoSim);

		JRadioButton kmVeiculoNao = new JRadioButton("Não é 0 KM");
		kmVeiculoNao.setBackground(new Color(0, 103, 80));
		kmVeiculoNao.setBounds(787, 244, 34, 59);
		frame.getContentPane().add(kmVeiculoNao);

		kmVeiculoNao.getSize();

		ButtonGroup kmVeiculo = new ButtonGroup();
		kmVeiculo.add(kmVeiculoSim);
		kmVeiculo.add(kmVeiculoNao);

		JRadioButton isFiscalSim = new JRadioButton("Possui isenção fiscal");
		isFiscalSim.setBackground(new Color(0, 103, 80));
		isFiscalSim.setBounds(652, 405, 34, 64);
		frame.getContentPane().add(isFiscalSim);

		JRadioButton isFiscalNao = new JRadioButton("Não possui isenção  fiscal");
		isFiscalNao.setBackground(new Color(0, 103, 80));
		isFiscalNao.setBounds(787, 410, 34, 59);
		frame.getContentPane().add(isFiscalNao);

		ButtonGroup isFiscal = new ButtonGroup();
		isFiscal.add(isFiscalSim);
		isFiscal.add(isFiscalNao);

		JRadioButton kitGasSim = new JRadioButton("Tem kit gas");
		kitGasSim.setBackground(new Color(0, 103, 80));
		kitGasSim.setBounds(652, 577, 34, 64);
		frame.getContentPane().add(kitGasSim);

		JRadioButton kitGasNao = new JRadioButton("Não tem kit gas");
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

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroSeguro telaCadastro = new TelaCadastroSeguro();
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
		
		
		
		
		
		
		
		  ActionListener radioListener = new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JRadioButton source = (JRadioButton) e.getSource();
	                String message = "Selecionado: " + source.getText();
	                System.out.println(message);
	            }
	        };
		
		
		
	        kmVeiculoSim.addActionListener(radioListener);
	        kmVeiculoNao.addActionListener(radioListener);
	        isFiscalSim.addActionListener(radioListener);
	        isFiscalNao.addActionListener(radioListener);
	        kitGasSim.addActionListener(radioListener);
	        kitGasNao.addActionListener(radioListener);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
		btnNewButton.setIcon(icon);
	}
	

}
