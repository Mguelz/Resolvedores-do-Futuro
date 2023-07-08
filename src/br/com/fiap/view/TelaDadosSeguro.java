package br.com.fiap.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class TelaDadosSeguro {

    private JFrame frame;

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

        JRadioButton rdbtnSim = new JRadioButton("");
        rdbtnSim.setBackground(new Color(0, 103, 80));
        rdbtnSim.setBounds(648, 252, 90, 64);
        frame.getContentPane().add(rdbtnSim);

        JRadioButton rdbtnNao= new JRadioButton("");
        rdbtnNao.setBackground(new Color(0,103,80));
        rdbtnNao.setBounds(777, 255, 80, 59);
        frame.getContentPane().add(rdbtnNao);
        
        rdbtnNao.getSize();
      

        ButtonGroup km = new ButtonGroup();
        km.add(rdbtnSim);
        km.add(rdbtnNao);
        
        
        
        
        
        
        
        
        JRadioButton rdbtnSim1 = new JRadioButton("");
        rdbtnSim1.setBackground(new Color(0, 103, 80));
        rdbtnSim1.setBounds(648, 424, 90, 64);
        frame.getContentPane().add(rdbtnSim1);
        
        JRadioButton rdbtnNao1 = new JRadioButton("");
        rdbtnNao1.setBackground(new Color(0, 103, 80));
        rdbtnNao1.setBounds(777, 424, 80, 59);
        frame.getContentPane().add(rdbtnNao1);
        
        
        ButtonGroup is = new ButtonGroup();
        is.add(rdbtnSim1);
        is.add(rdbtnNao1);
        
        
        
        JRadioButton rdbtnSim2 = new JRadioButton("");
        rdbtnSim2.setBackground(new Color(0, 103, 80));
        rdbtnSim2.setBounds(648, 591, 90, 64);
        frame.getContentPane().add(rdbtnSim2);
        
        JRadioButton rdbtnNao2 = new JRadioButton("");
        rdbtnNao2.setBackground(new Color(0, 103, 80));
        rdbtnNao2.setBounds(777, 596, 80, 59);
        frame.getContentPane().add(rdbtnNao2);
        

        
        
        ButtonGroup kg = new ButtonGroup();
        kg.add(rdbtnSim2);
        kg.add(rdbtnNao2);
        
        
        
        
        
        
        // deixar em ultimo!!!!!!
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TelaDadosSeguro.class.getResource("/Seguro.png")));
        lblNewLabel.setBounds(10, -152, 1884, 1092);
        frame.getContentPane().add(lblNewLabel);
        

        // deixar em todos
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
