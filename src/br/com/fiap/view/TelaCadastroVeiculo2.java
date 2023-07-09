package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
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

public class TelaCadastroVeiculo2 {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JComboBox<String> tipoUtilizacao;
	private JComboBox<String> comboAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroVeiculo2 window = new TelaCadastroVeiculo2();
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
	public TelaCadastroVeiculo2() {
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

		JComboBox<String> comboMarca = new JComboBox<String>();
		comboMarca.setEditable(true);
		comboMarca.setToolTipText("Tipo de utilização");
		comboMarca.setMaximumRowCount(3);
		comboMarca.setForeground(new Color(0, 103, 80));
		comboMarca.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboMarca.setBackground(new Color(255, 255, 255));
		comboMarca.setBounds(98, 263, 344, 87);
		frame.getContentPane().add(comboMarca);
		comboMarca.setSelectedItem("Selecione a marca"); //  deixa um titulo na comboBox -- (selecione o editable no painel propertis)

		JComboBox<String> comboAno = new JComboBox<String>();
		comboAno.setEditable(true);
		comboAno.setToolTipText("Tipo de utilização");
		comboAno.setMaximumRowCount(3);
		comboAno.setForeground(new Color(0, 103, 80));
		comboAno.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboAno.setBackground(new Color(255, 255, 255));
		comboAno.setBounds(98, 488, 344, 87);
		frame.getContentPane().add(comboAno);
		comboAno.setSelectedItem("Selecione o ano"); //  deixa um titulo na comboBox -- (selecione o editable no painel propertis)

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
		

		JComboBox<String> comboCorretor = new JComboBox<String>();
		comboCorretor.setEditable(true);
		comboCorretor.setToolTipText("Tipo de utilização");
		comboCorretor.setMaximumRowCount(3);
		comboCorretor.setForeground(new Color(0, 103, 80));
		comboCorretor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboCorretor.setBackground(new Color(255, 255, 255));
		comboCorretor.setBounds(587, 263, 344, 87);
		frame.getContentPane().add(comboCorretor);
		comboCorretor.setSelectedItem("Escolha o corretor"); //  deixa um titulo na comboBox -- (selecione o editable no painel propertis)

		JComboBox<String> comboCombustivel = new JComboBox<String>();
		comboCombustivel.setEditable(true);
		comboCombustivel.setToolTipText("Tipo de utilização");
		comboCombustivel.setMaximumRowCount(3);
		comboCombustivel.setForeground(new Color(0, 103, 80));
		comboCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboCombustivel.setBackground(new Color(255, 255, 255));
		comboCombustivel.setBounds(587, 488, 344, 87);
		frame.getContentPane().add(comboCombustivel);
		comboCombustivel.setSelectedItem("Tipo combustivel"); //  deixa um titulo na comboBox -- (selecione o editable no painel propertis)

		comboCombustivel.addItem("Gasolina");
		comboCombustivel.addItem("Alcool");
		comboCombustivel.addItem("Flex");
		comboCombustivel.addItem("Diesel");

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
				TelaDadosSeguro telaCadastro = new TelaDadosSeguro();
				telaCadastro.frame.setVisible(true);
				String combustivel = (String) comboCombustivel.getSelectedItem();
				String ano = (String) comboAno.getSelectedItem();
				System.out.println(combustivel + " "+ ano);
				
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
