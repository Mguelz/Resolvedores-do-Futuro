package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class TelaCadastroUsuario3 {

	public JFrame frame;
	private JTextField digiteCelular;
	private JTextField digiteSenha;
	private JTextField digiteNome;
	private JTextField digiteCpf;
	private JTextField digiteDataNasc;
	private JButton proxPag;
	private JButton proxPag_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuario3 window = new TelaCadastroUsuario3();
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
	public TelaCadastroUsuario3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon image = new ImageIcon("LogoTokio.png"); //criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame
		
		
		

		digiteCelular = new JTextField();
		digiteCelular.setBackground(new Color(244, 244, 244));
		digiteCelular.setText("Digite Aqui");
		digiteCelular.setBounds(219, 270, 355, 46);
		frame.getContentPane().add(digiteCelular);
		digiteCelular.setColumns(10);
		digiteCelular.setBorder(null);
		digiteCelular.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
		
		
		
		
		digiteCpf = new JTextField();
		digiteCpf.setText("Digite Aqui");
		digiteCpf.setColumns(10);
		digiteCpf.setBorder(null);
		digiteCpf.setBackground(new Color(244, 244, 244));
		digiteCpf.setBounds(219, 538, 341, 46);
		frame.getContentPane().add(digiteCpf);
		digiteCpf.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		digiteDataNasc = new JTextField();
		digiteDataNasc.setText("DD / MM / AAAA");
		digiteDataNasc.setColumns(10);
		digiteDataNasc.setBorder(null);
		digiteDataNasc.setBackground(new Color(244, 244, 244));
		digiteDataNasc.setBounds(814, 270, 341, 46);
		frame.getContentPane().add(digiteDataNasc);
		digiteDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
		proxPag = new JButton("New button");
		proxPag.setBorderPainted(false);
		proxPag.setBackground(new Color(0, 103, 80));
		proxPag.setBounds(1231, 627, 109, 126);
		frame.getContentPane().add(proxPag);
		adicionarIcone(proxPag);
		
		
		
		
		
		
		proxPag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastroUsuario telaCadastro = new TelaCadastroUsuario();
                telaCadastro.frame.setVisible(true);
                frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
            }
        });
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroUsuario3.class.getResource("/Usuario2.png")));
		lblNewLabel.setBounds(0, -165, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
	private void adicionarIcone(JButton proxPag) {
        ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
        proxPag.setIcon(icon);
    }
}

