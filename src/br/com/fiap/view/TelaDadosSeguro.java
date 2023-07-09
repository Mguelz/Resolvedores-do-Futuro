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
        
        ImageIcon image = new ImageIcon("LogoTokio.png"); //criando o ícone da imagem
		frame.setIconImage(image.getImage()); // mudando o ícone do frame

        JRadioButton rdbtnSim = new JRadioButton("");
        rdbtnSim.setBackground(new Color(0, 103, 80));
        rdbtnSim.setBounds(652, 239, 34, 64);
        frame.getContentPane().add(rdbtnSim);

        JRadioButton rdbtnNao= new JRadioButton("");
        rdbtnNao.setBackground(new Color(0,103,80));
        rdbtnNao.setBounds(787, 244, 34, 59);
        frame.getContentPane().add(rdbtnNao);
        
        rdbtnNao.getSize();
      

        ButtonGroup km = new ButtonGroup();
        km.add(rdbtnSim);
        km.add(rdbtnNao);
        
        
        
       
        
        
        
        
        JRadioButton rdbtnSim1 = new JRadioButton("");
        rdbtnSim1.setBackground(new Color(0, 103, 80));
        rdbtnSim1.setBounds(652, 405, 34, 64);
        frame.getContentPane().add(rdbtnSim1);
        
        JRadioButton rdbtnNao1 = new JRadioButton("");
        rdbtnNao1.setBackground(new Color(0, 103, 80));
        rdbtnNao1.setBounds(787, 410, 34, 59);
        frame.getContentPane().add(rdbtnNao1);
        
        
        ButtonGroup is = new ButtonGroup();
        is.add(rdbtnSim1);
        is.add(rdbtnNao1);
        
        
        
        JRadioButton rdbtnSim2 = new JRadioButton("");
        rdbtnSim2.setBackground(new Color(0, 103, 80));
        rdbtnSim2.setBounds(652, 577, 34, 64);
        frame.getContentPane().add(rdbtnSim2);
        
        JRadioButton rdbtnNao2 = new JRadioButton("");
        rdbtnNao2.setBackground(new Color(0, 103, 80));
        rdbtnNao2.setBounds(787, 582, 34, 59);
        frame.getContentPane().add(rdbtnNao2);
        

        
        
        ButtonGroup kg = new ButtonGroup();
        kg.add(rdbtnSim2);
        kg.add(rdbtnNao2);
        
        
        
        
        
        JButton proxPag = new JButton("New button");
        proxPag.setBackground(new Color(0, 103, 80));
        proxPag.setBounds(1238, 617, 109, 126);
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
        
        
       
        
        
    }
    private void adicionarIcone(JButton btnNewButton) {
        ImageIcon icon = new ImageIcon(TelaGerarApolice.class.getResource("setaVoltar.png"));
        btnNewButton.setIcon(icon);
    }
    
}
