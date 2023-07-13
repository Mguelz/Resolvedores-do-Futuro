
package br.com.fiap.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.controller.ClienteController;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.repository.ClienteDAO;

public class TelaReadCRUD {

	public JFrame frame;
	private JTable table;
	private DefaultTableModel modelo;
	

	/**
	 * Create the application.
	 */
	public TelaReadCRUD() {
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

		ClienteController ClienteController = new ClienteController();

		table = new JTable();
		table.setBounds(75, 77, 888, 545);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(new Object[][] { { "Cpf", "Nome", "Email" }, },
				new String[] { "New column", "New column", "New column" }));
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(table);
		table.setVisible(true);

//		JButton btnHome = new JButton("New button");
//		btnHome.setBounds(239, 634, 80, 78);
//
//		btnHome.setBackground(new Color(0, 103, 80));
//		btnHome.setForeground(new Color(0, 103, 80));
//		btnHome.setBorderPainted(false);
//		adicionarIcone(btnHome);
//
//		JButton btnReset = new JButton("New button");
//		btnReset.setBounds(344, 639, 63, 68);
//
//		btnReset.setBackground(new Color(0, 103, 80));
//		btnReset.setForeground(new Color(0, 103, 80));
//		btnReset.setBorderPainted(false);
//		adicionarIcone2(btnReset);
//
//		btnReset.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				preencherTabela();
//			}
//		});
//
//		btnHome.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				TelaInicial telaInicial = new TelaInicial();
//				telaInicial.frame.setVisible(true);
//				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
//			}
//		});
		JButton btnHome = new JButton("New button");
		btnHome.setBounds(1092, 580, 89, 63);
		btnHome.setBackground(new Color(0, 103, 80));
		btnHome.setForeground(new Color(0, 103, 80));
		frame.getContentPane().add(btnHome);
		btnHome.setBorderPainted(false);
		adicionarIcone(btnHome);
		
		
		JButton btnReset = new JButton("New button");
		btnReset.setBounds(1191, 586, 69, 51);
		btnReset.setBackground(new Color(0, 103, 80));
		btnReset.setForeground(new Color(0, 103, 80));
		frame.getContentPane().add(btnReset);
		btnReset.setBorderPainted(false);
		adicionarIcone2(btnReset);
		
		
		btnHome.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaInicial telaInicial = new TelaInicial();
			telaInicial.frame.setVisible(true);
			frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
		}
	});
		
		
		
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTabela();
				preencherTabela();
			}
		});
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		modelo = (DefaultTableModel) table.getModel();

		Container container = frame.getContentPane();
		container.add(table);

		modelo.addColumn("Nome");
		modelo.addColumn("Email");
		modelo.addColumn("Telefone");
		modelo.addColumn("Cpf");
		modelo.addColumn("Senha");
		modelo.addColumn("Estado Civil");

		preencherTabela();

		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaReadCRUD.class.getResource("/ReadCRUD.png")));
		lblNewLabel.setBounds(0, -162, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);
		

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("botaoHome.png"));
		btnNewButton.setIcon(icon);
	}

	private void preencherTabela() {
		ClienteDAO DAO = new ClienteDAO();
		List<ClienteModel> usuarios = DAO.selectAll();
		try {
			for (ClienteModel usuario : usuarios) {
				modelo.addRow(new Object[] { usuario.getCpf(), usuario.getNomeCliente(), usuario.getEmail() });
				 System.out.println(usuario.getCpf());
			}
		} catch (Exception e) {
			throw e;
		}
	}

	private void adicionarIcone2(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("reset.png"));
		btnNewButton.setIcon(icon);
	}
	private void limparTabela() {
		modelo.getDataVector().clear();
	}
	
	
}