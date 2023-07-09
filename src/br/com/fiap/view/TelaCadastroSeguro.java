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
import javax.swing.LookAndFeel;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class TelaCadastroSeguro {

    public JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastroSeguro window = new TelaCadastroSeguro();
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
    public TelaCadastroSeguro() {
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

        ImageIcon image = new ImageIcon("LogoTokio.png"); //criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame
        
        
        JComboBox<String> tipoUtilizacao = new JComboBox<>();
        tipoUtilizacao.setFont(new Font("Tahoma", Font.PLAIN, 25));
        
        
        tipoUtilizacao.addItem("Locomoção diária");
        tipoUtilizacao.addItem("Locomoção até o trabalho");
        tipoUtilizacao.addItem("Motorista de aplicativo");
        tipoUtilizacao.addItem("Motorista de táxi");
        tipoUtilizacao.addItem("PCD - Locomoção diária");
        tipoUtilizacao.addItem("PCD - Exercício de trabalho");
        //comboBox.getFont();
        
        
        tipoUtilizacao.setToolTipText("Tipo de utilização");
        tipoUtilizacao.setForeground(new Color(0, 103, 80));
        tipoUtilizacao.setBackground(new Color(255, 255, 255));
        tipoUtilizacao.setBounds(198, 261, 398, 87);
        frame.getContentPane().add(tipoUtilizacao);
        
        
        
        
        
        JComboBox<String> garagem = new JComboBox<String>();
        garagem.setFont(new Font("Tahoma", Font.PLAIN, 23));
        
        garagem.setToolTipText("");
        garagem.setForeground(new Color(0, 103, 80));
        garagem.setBackground(Color.WHITE);
        garagem.setBounds(198, 519, 398, 87);
        frame.getContentPane().add(garagem);
        
        
       
        
        tipoUtilizacao.setUI(new BasicComboBoxUI() {
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
        ///
        
        garagem.setUI(new BasicComboBoxUI() {
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
        
        garagem.addItem("Exclusivamente na residência");
        garagem.addItem("Exclusivamente no trabalho");
        garagem.addItem("Residência e trabalho");
        garagem.addItem("Garagem paga");
        garagem.addItem("Não possuo");
        

        proxPag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastroDependente telaCadastro = new TelaCadastroDependente();
                telaCadastro.frame.setVisible(true);
                String tpUtilizacao = (String) tipoUtilizacao.getSelectedItem();
                String tpGaragem = (String) garagem.getSelectedItem();
                System.out.println(tpGaragem +" "+tpUtilizacao);
                frame.dispose(); // Fechar a tela atual (TelaDadosSeguro)
            }
        });
        
        
		// deixar em ultimo!!!!!!
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TelaCadastroSeguro.class.getResource("/Seguro2.png")));
        lblNewLabel.setBounds(0, -162, 1884, 1092);
        frame.getContentPane().add(lblNewLabel);
        // deixar em todos
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }
    private void adicionarIcone(JButton btnNewButton) {
        ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
        btnNewButton.setIcon(icon);
    }
}
