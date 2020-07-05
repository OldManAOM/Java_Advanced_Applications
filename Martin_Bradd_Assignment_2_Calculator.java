/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

/**
 *
 * @author Bradd
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Martin_Bradd_Assignment_2_Calculator extends JFrame {
    JTextField userInput;
    JLabel output;
    JButton add;
    JButton subtract;
    JButton clear;
    
    public Martin_Bradd_Assignment_2_Calculator(){
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TitledBorder border = new TitledBorder("Input");
        userInput = new JTextField();
        userInput.setBorder(border);
        TitledBorder border2 = new TitledBorder("Current total");
        output = new JLabel("0.0");
        output.setBorder(border2);
        
        add = new JButton("Add");
        subtract = new JButton("Subtract");
        clear = new JButton("Clear");
        
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(userInput.getText());
                    double current = Double.parseDouble(output.getText());
                    double total = current + amount;
                    
                    output.setText(Double.toString(total));
                }
                catch(NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Please enter a number!");
                }
            }
        });
        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(userInput.getText());
                    double current = Double.parseDouble(output.getText());
                    double total = current - amount;
                    
                    output.setText(Double.toString(total));
                }
                catch(NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Please enter a number!");
                }
            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText("0.0");
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(add);
        panel.add(subtract);
        panel.add(clear);
        
        add(userInput, BorderLayout.NORTH);
        add(output, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        Martin_Bradd_Assignment_2_Calculator calc = new Martin_Bradd_Assignment_2_Calculator();
        
        calc.setVisible(true);
    }
}
