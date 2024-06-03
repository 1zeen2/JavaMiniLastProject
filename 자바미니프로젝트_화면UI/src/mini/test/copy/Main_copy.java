package mini.test.copy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_copy extends JFrame implements ActionListener, MouseListener {

    private CardLayout card = new CardLayout();
    Scheduler_copy sc = new Scheduler_copy();

    public Main_copy() {
        setLayout(card);

        add("LIST", sc);
        setTitle("게시판 ver 1.0");
        setSize(1366, 768);
        setVisible(true);

        sc.inBtn.addActionListener(this);
        sc.table.addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main_copy();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
} 
