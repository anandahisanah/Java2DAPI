package main;

import javax.swing.JFrame;

public class Bangun {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menggambar Bangun 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BangunJPanel bangunJPanel = new BangunJPanel();

        frame.add(bangunJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
}
