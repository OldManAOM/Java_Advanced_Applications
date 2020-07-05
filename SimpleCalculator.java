/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

/**
 *
 * @author tec435-student
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleCalculator extends JFrame {

    //components
    private final JLabel jlblDisplay;
    private final JButton jbtZero, jbtOne, jbtTwo, jbtThree, jbtFour;
    private final JButton jbtFive, jbtSix, jbtSeven, jbtEight, jbtNine;
    private final JButton jbtAdd, jbtSubtract;
    private final JButton jbtCalc, jbtReset;

    //constructor: place all components into the JFrame
    public SimpleCalculator() {
        jlblDisplay = new JLabel("   ");

        //create a sub contain to hold the buttons
        JPanel jpDigits = new JPanel();
        jbtZero = new JButton("0");
        jbtOne = new JButton("1");
        jbtTwo = new JButton("2");
        jbtThree = new JButton("3");
        jbtFour = new JButton("4");
        jbtFive = new JButton("5");
        jbtSix = new JButton("6");
        jbtSeven = new JButton("7");
        jbtEight = new JButton("8");
        jbtNine = new JButton("9");
        jbtAdd = new JButton("+");
        jbtSubtract = new JButton("-");

        //set the layout of jpDigits to GridLayout
        jpDigits.setLayout(new GridLayout(4, 3));
        jpDigits.add(jbtSeven);
        jpDigits.add(jbtEight);
        jpDigits.add(jbtNine);
        
        jpDigits.add(jbtFour);
        jpDigits.add(jbtFive);
        jpDigits.add(jbtSix);
        
        jpDigits.add(jbtOne);
        jpDigits.add(jbtTwo);
        jpDigits.add(jbtThree);
        
        jpDigits.add(jbtZero);
        jpDigits.add(jbtAdd);
        jpDigits.add(jbtSubtract);

        //create a sub container to hold another buttons
        JPanel jpCommands = new JPanel(new FlowLayout());
        jbtCalc = new JButton("Calc");
        jbtReset = new JButton("Reset");
        jpCommands.add(jbtCalc);
        jpCommands.add(jbtReset);

        //place all components to the SimpleCalculator
        add(jlblDisplay, BorderLayout.NORTH);
        add(jpDigits, BorderLayout.CENTER);
        add(jpCommands, BorderLayout.SOUTH);

        //create event handler to handle all ActionEvent
        ButtonEvent buttonClicked = new ButtonEvent();

        //register the event handler to all JButtons
        jbtOne.addActionListener(buttonClicked);
        jbtTwo.addActionListener(buttonClicked);
        jbtThree.addActionListener(buttonClicked);
        
        jbtAdd.addActionListener(buttonClicked);
        jbtSubtract.addActionListener(buttonClicked);
        jbtCalc.addActionListener(buttonClicked);
        
    }

    //define a private inner class to handle the ActionEvent
    private class ButtonEvent implements ActionListener {

        String result = "";

        @Override
        public void actionPerformed(ActionEvent e) {
            //determine which button is clicked 
            //and then generate corresponed message
            
          
            
            if (e.getSource() == jbtOne) {
                result += jbtOne.getText();
            } else if (e.getSource() == jbtTwo) {
                result += jbtTwo.getText();
            } else if (e.getSource() == jbtThree) {
                result += jbtThree.getText();
            }//check all other numbers
            else if (e.getSource() == jbtAdd) {
                result += jbtAdd.getText();
            } else if (e.getSource() == jbtCalc) {
                result = calculate(result);
                
            } else if (e.getSource() == jbtReset) {
                //reset();
            }
            
            jlblDisplay.setText(result);            
        }
        
    }//end of inner class

    private String calculate(String s) {
        //break the s into an expression
        int num1, num2, result;
        int addPosition = s.indexOf('+');
        int minusPosition = s.indexOf('-');
        if (addPosition != -1) {
            num1 = Integer.parseInt(s.substring(0, addPosition));
            num2 = Integer.parseInt(s.substring(addPosition + 1));
            result = num1 + num2;
            s += " = " + result;
            disableButtons();
        } else if (minusPosition != -1) {
            num1 = Integer.parseInt(s.substring(0, minusPosition));
            num2 = Integer.parseInt(s.substring(minusPosition + 1));
            result = num1 - num2;
            s += " = " + result;
            disableButtons();
        } else {
            JOptionPane.showMessageDialog(null, "No Operator Found",
                    "Operator Needed", JOptionPane.WARNING_MESSAGE);
        }
        
        return s;
    }

    private void disableButtons() {
        jbtOne.setEnabled(false);
        jbtCalc.setEnabled(false);
    }

    //test 
    public static void main(String[] args) {
        //instance a SimpleCalculator
        SimpleCalculator window = new SimpleCalculator();
        window.setTitle("Simple Calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    
}
