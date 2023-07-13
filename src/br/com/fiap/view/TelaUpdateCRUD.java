
package br.com.fiap.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
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

public class TelaUpdateCRUD {

	public JFrame frame;
	private JTable table;
	private DefaultTableModel modelo;
	private ClienteDAO dao = new ClienteDAO();

	/**
	 * Create the application.
	 */
	public TelaUpdateCRUD() {
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

		JButton btnHome = new JButton("New button");
		btnHome.setBackground(new Color(0, 103, 80));
		btnHome.setForeground(new Color(0, 103, 80));
		btnHome.setBounds(1191, 551, 113, 108);
		btnHome.setBorderPainted(false);
		adicionarIcone(btnHome); // Adicionar o ícone ao botão
		frame.getContentPane().add(btnHome);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial telaInicial = new TelaInicial();
				telaInicial.frame.setVisible(true);
				frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
			}
		});

		
		
		
		
		
		JButton btnSalvar = new JButton("New button");
		btnSalvar.setForeground(new Color(0, 103, 80));
		btnSalvar.setBorderPainted(false);
		btnSalvar.setBackground(new Color(0, 103, 80));
		btnSalvar.setBounds(974, 551, 113, 108);
		adicionarIcone1(btnSalvar); // Adicionar o ícone ao botão
		frame.getContentPane().add(btnSalvar);

		JButton btnDelete = new JButton("New button");
		btnDelete.setForeground(new Color(0, 103, 80));
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(0, 103, 80));

		btnDelete.setBounds(1085, 551, 113, 108);
		adicionarIcone2(btnDelete); // Adicionar o ícone ao botão
		frame.getContentPane().add(btnDelete);

		table = new JTable();
		table.setBounds(75, 77, 888, 545);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(new Object[][] { { "CPF", "Nome", "Email" }, },
				new String[] { "New column", "New column", "New column" }));
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(table);
		table.setVisible(true);

		modelo = (DefaultTableModel) table.getModel();

		Container container = frame.getContentPane();
		container.add(table);

		modelo.addColumn("CPF");
		modelo.addColumn("Nome");
		modelo.addColumn("Email");
		
		
		
		//Delete Action
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			deletar();
			limparTabela();
			preencherTabela();
			}
		});

		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
				preencherTabela();
				limparTabela();
			}
		});

		preencherTabela();

		// deixar em todos
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// deixar em ultimo!!!!!!
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaUpdateCRUD.class.getResource("/UpdateCRUD.png")));
		lblNewLabel.setBounds(0, -162, 1884, 1092);
		frame.getContentPane().add(lblNewLabel);

	}

	private void adicionarIcone(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("botaoHome.png"));
		btnNewButton.setIcon(icon);
	}

	private void adicionarIcone1(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("botaoSalvar.png"));
		btnNewButton.setIcon(icon);
	}

	private void adicionarIcone2(JButton btnNewButton) {
		ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("botaoDelete.png"));
		btnNewButton.setIcon(icon);
	}

	private void preencherTabela() {
		ClienteDAO cdao = new ClienteDAO();
		List<ClienteModel> clientes = cdao.selectAll();
		try {
			for (ClienteModel cliente : clientes) {

//				i++;
//				System.out.println(i);
				modelo.addRow(new Object[] { cliente.getCpf(), cliente.getNomeCliente(), cliente.getEmail() });
				;
				// System.out.println(usuario.getCelularCliente());
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public void atualizar() {
		Object objetoDaLinha = (Object) modelo.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
		if (objetoDaLinha instanceof Long) {
			long cpf = (long) objetoDaLinha;
			String nome = (String) modelo.getValueAt(table.getSelectedRow(), 1);
			String email = (String) modelo.getValueAt(table.getSelectedRow(), 2);
			ClienteModel cliente = new ClienteModel(nome, email);
			cliente.setCpf(cpf);
			this.dao.update(cliente);
			System.out.println("Item alterado");
		} else {
			System.out.println("selecionar ID");
		}
	}

	private void limparTabela() {
		modelo.getDataVector().clear();
	}

	public void deletar() {
		Object objetoDaLinha = (Object) modelo.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
		if (objetoDaLinha instanceof Long) {
			long cpf = (long) objetoDaLinha;
			this.dao.delete(cpf);
			modelo.removeRow(table.getSelectedRow());
			System.out.println("Item deletado");
		} else {
			System.out.println("selecionar ID");
		}
	}

}
