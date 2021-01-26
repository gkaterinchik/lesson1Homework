package ru.geekbrains.lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class TicTacToeSwing {
    static Map mapA = new HashMap();
    static JLabel ResultText = new JLabel("!!!");

    public static void main(String[] args) {
        ResultText.setVisible(true);
        TicTacToe game = new TicTacToe();
        SwingForm form = new SwingForm();
        JPanel panel1 = new JPanel();
        //JTextArea ResultText = new JTextArea("______");

        JButton[] buttons = new JButton[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
        }
        for (JButton button : buttons) {
            panel1.add(button);


        }


        panel1.setLayout(new FlowLayout());

        form.getContentPane().add(panel1);
        panel1.add(ResultText);
        for (JButton button : buttons
        ) {
            button.setPreferredSize(new Dimension(100, 100));

        }
        TestactionListener actionListener = new TestactionListener();

        buttons[0].setActionCommand("00");
        buttons[0].addActionListener(actionListener);

        buttons[1].setActionCommand("01");
        buttons[1].addActionListener(actionListener);

        buttons[2].setActionCommand("02");
        buttons[2].addActionListener(actionListener);
        buttons[3].setActionCommand("10");
        buttons[3].addActionListener(actionListener);
        buttons[4].setActionCommand("11");
        buttons[4].addActionListener(actionListener);
        buttons[5].setActionCommand("12");
        buttons[5].addActionListener(actionListener);
        buttons[6].setActionCommand("20");
        buttons[6].addActionListener(actionListener);
        buttons[7].setActionCommand("21");
        buttons[7].addActionListener(actionListener);
        buttons[8].setActionCommand("22");
        buttons[8].addActionListener(actionListener);
        form.setVisible(true);


        mapA.put("00", buttons[0]);
        mapA.put("01", buttons[1]);
        mapA.put("02", buttons[2]);
        mapA.put("10", buttons[3]);
        mapA.put("11", buttons[4]);
        mapA.put("12", buttons[5]);
        mapA.put("20", buttons[6]);
        mapA.put("21", buttons[7]);
        mapA.put("22", buttons[8]);


        game.initGameField();
        game.renderGameField();

    }

    public static class ChangeListener implements javax.swing.event.ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            System.out.println(e);
        }
    }

    public static class TestactionListener implements ActionListener {

        //@Override
        public void actionPerformed(ActionEvent e) {

            String[] coordinate = new String[2];
            coordinate = e.getActionCommand().split("");
            System.out.println("x = " + Integer.parseInt(coordinate[0]));
            System.out.println("y = " + Integer.parseInt(coordinate[1]));
            TicTacToe.humanTurn(Integer.parseInt(coordinate[0]), Integer.parseInt(coordinate[1]), e);


            TicTacToe.renderGameField();


        }
    }

    public static class SwingForm extends JFrame {
        SwingForm() {
            super("TicTacToe");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //setPreferredSize(new Dimension(500,500));
            setSize(340, 500);


        }


    }
}