package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaGerarApolice {
    public JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaGerarApolice window = new TelaGerarApolice();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaGerarApolice() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        ImageIcon image = new ImageIcon("LogoTokio.png"); //criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame

        JButton btnNewButton = new JButton("New button");
        btnNewButton.setBackground(new Color(244, 244, 244));
        btnNewButton.setForeground(new Color(244, 244, 244));
        btnNewButton.setBounds(689, 188, 113, 108);
        btnNewButton.setBorderPainted(false);
        adicionarIcone(btnNewButton); // Adicionar o ícone ao botão
        frame.getContentPane().add(btnNewButton);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JButton btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setForeground(new Color(244, 244, 244));
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBackground(new Color(244, 244, 244));
        adicionarIcone(btnNewButton_1);
        btnNewButton_1.setBounds(689, 510, 113, 108);
        frame.getContentPane().add(btnNewButton_1);
        
        JButton proxPag = new JButton("New button");
        proxPag.setBorderPainted(false);
        proxPag.setBackground(new Color(244, 244, 244));
        proxPag.setBounds(1242, 584, 109, 126);
        frame.getContentPane().add(proxPag);
        adicionarIcone1(proxPag);
        
        
        
        

        proxPag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaMensagemFinal telaCadastro = new TelaMensagemFinal();
                telaCadastro.frame.setVisible(true);
                frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
            }
        });
        
        
        
        // Deixar em último
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TelaGerarApolice.class.getResource("/Mensagem1.png")));
        lblNewLabel.setBounds(0, -206, 1884, 1092);
        frame.getContentPane().add(lblNewLabel);
        
        
    }

    private void adicionarIcone(JButton btnNewButton) {
        ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("seta.png"));
        btnNewButton.setIcon(icon);
    }
    private void adicionarIcone1(JButton btnNewButton) {
        ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVerde.png"));
        btnNewButton.setIcon(icon);
    }
    
}