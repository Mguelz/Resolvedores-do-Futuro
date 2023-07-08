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

public class TelaCadastroUsuario1 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastroUsuario1 window = new TelaCadastroUsuario1();
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
    public TelaCadastroUsuario1() {
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
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
        
        
        comboBox.addItem("Acre");
        comboBox.addItem("Alagoas");
        comboBox.addItem("Amapá");
        comboBox.addItem("Amazonas");
        comboBox.addItem("Bahia");
        comboBox.addItem("Ceara");
        comboBox.addItem("Espírito Santo");
        comboBox.addItem("Goiás");
        comboBox.addItem("Maranhão");
        comboBox.addItem("Mato Grosso");
        comboBox.addItem("Mato Grosso Do Sul");
        comboBox.addItem("Minas Gerais");
        comboBox.addItem("Pará");
        comboBox.addItem("Paraíba");
        comboBox.addItem("Paraná");
        comboBox.addItem("Pernambuco");
        comboBox.addItem("Piauí");
        comboBox.addItem("Rio De Janeiro");
        comboBox.addItem("Rio Grande Do Norte");
        comboBox.addItem("Rio Grande Do Sul");
        comboBox.addItem("Rondônia");
        comboBox.addItem("Roraima");
        comboBox.addItem("Santa Catarina");
        comboBox.addItem("São Paulo");
        comboBox.addItem("Sergipe");
        comboBox.addItem("Tocantins");
        comboBox.addItem("Distrito Federal");
        
        
        //comboBox.getFont();
        
        
        comboBox.setToolTipText("Tipo de utilização");
        comboBox.setForeground(new Color(0, 103, 80));
        comboBox.setBackground(new Color(255, 255, 255));
        comboBox.setBounds(112, 273, 344, 87);
        frame.getContentPane().add(comboBox);
        comboBox.setMaximumRowCount(3);
        
        

        
        
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
        
        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setToolTipText("Tipo de utilização");
        comboBox_1.setForeground(new Color(0, 103, 80));
        comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        comboBox_1.setBackground(Color.WHITE);
        comboBox_1.setBounds(112, 497, 344, 87);
        frame.getContentPane().add(comboBox_1);
        
        
        comboBox_1.setUI(new BasicComboBoxUI() {
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
        
        
        
        comboBox_1.addItem("Masculino");
        comboBox_1.addItem("Feminino");
        
        
        JComboBox<String> comboBox2 = new JComboBox<String>();
        comboBox2.setToolTipText("Tipo de utilização");
        comboBox2.setForeground(new Color(0, 103, 80));
        comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setBounds(606, 273, 344, 87);
        frame.getContentPane().add(comboBox2);
        
        comboBox2.setUI(new BasicComboBoxUI() {
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
        
        
        
        
        
        comboBox2.addItem("Casado(a)");
        comboBox2.addItem("Solteiro");
        comboBox2.addItem("Viuvo");
        
        
        
        
        
        
        
        
        
        
        
        
        
        JComboBox<String> comboBox3 = new JComboBox<String>();
        comboBox3.setToolTipText("Tipo de utilização");
        comboBox3.setForeground(new Color(0, 103, 80));
        comboBox3.setFont(new Font("Tahoma", Font.PLAIN, 30));
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setBounds(606, 497, 344, 87);
        frame.getContentPane().add(comboBox3);
        
        
        comboBox3.addItem("Menos de 2 anos");
        comboBox3.addItem("Mais de 2 anos");
        
        
        
        
        comboBox3.setUI(new BasicComboBoxUI() {
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // deixar em todos
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // deixar em ultimo!!!!!!
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(TelaCadastroUsuario1.class.getResource("/Usuario3.png")));
        lblNewLabel.setBounds(10, -152, 1884, 1092);
        frame.getContentPane().add(lblNewLabel);
    }
}
