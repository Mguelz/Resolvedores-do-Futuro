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

public class TelaCadastroVeiculo {

	public JFrame frame;
	private JTextField digitePlaca;
	private JTextField digiteChassi;
	private JComboBox<String> tipoUtilizacao;
	private JComboBox<String> comboModelo;
	private JButton proxPag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroVeiculo window = new TelaCadastroVeiculo();
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

		comboModelo = new JComboBox<String>();
		comboModelo.setToolTipText("Modelo Do Veiculo");
		comboModelo.setMaximumRowCount(3);
		comboModelo.setForeground(new Color(0, 103, 80));
		comboModelo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboModelo.setBackground(new Color(244, 244, 244));
		comboModelo.setBounds(183, 522, 344, 87);
		frame.getContentPane().add(comboModelo);

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

		proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1228, 591, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);

		proxPag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroVeiculo2 telaCadastro = new TelaCadastroVeiculo2();
				telaCadastro.frame.setVisible(true);
				String placa =  new String (digitePlaca.getText());
				String chassi =  new String  (digiteChassi.getText());
				System.out.println("Placa:  "+placa +  " Numero Chassi: "+chassi);
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
