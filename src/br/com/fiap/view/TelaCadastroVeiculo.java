package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LookAndFeel;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.Font;

public class TelaCadastroVeiculo {

    private JFrame frame;

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

       
        
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        
        comboBox.addItem("Locomoção diária");
        comboBox.addItem("Locomoção até o trabalho");
        comboBox.addItem("Motorista de aplicativo");
        comboBox.addItem("Motorista de táxi");
        comboBox.addItem("PCD - Locomoção diária");
        comboBox.addItem("PCD - Exercício de trabalho");
        //comboBox.getFont();
        
        
        comboBox.setToolTipText("Tipo de utilização");
        comboBox.setForeground(new Color(0, 103, 80));
        comboBox.setBackground(new Color(255, 255, 255));
        comboBox.setBounds(198, 273, 398, 87);
        frame.getContentPane().add(comboBox);
        
        
        
        
        
        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setToolTipText("");
        comboBox_1.setForeground(Color.BLACK);
        comboBox_1.setBackground(Color.WHITE);
        comboBox_1.setBounds(212, 532, 398, 87);
        frame.getContentPane().add(comboBox_1);
        
        

        // deixar em ultimo!!!!!!
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TelaCadastroVeiculo.class.getResource("/Seguro2.png")));
        lblNewLabel.setBounds(10, -152, 1884, 1092);
        frame.getContentPane().add(lblNewLabel);
        // deixar em todos
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        comboBox.setUI(new BasicComboBoxUI() {
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
        
        
        
        
        
    }
}
