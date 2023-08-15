package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class BangunJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // cast g menjadi Graphics2D
        Graphics2D g2d = (Graphics2D) g;

        // menggambar elips 2D ellipse terisi dengan biru-kuning gradien
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

        // menggambar persegi-panjang 2D dalam merah
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

        // menggambar persegi-panjang bundar 2D dengan latar tersangga
        BufferedImage bufferedImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);

        // mendapatkan Graphics2D dari buffImage
        Graphics2D gg = bufferedImage.createGraphics();
        gg.setColor(Color.YELLOW); // menggambar dalam kuning
        gg.fillRect(0, 0, 10, 10); // menggambar sebuah persegi-panjang terisi
        gg.setColor(Color.BLACK); // menggambar dalam hitam
        gg.fillRect(1, 1, 6, 6); // menggambar sebuah persegi-panjang
        gg.setColor(Color.BLUE); // menggambar dengan biru
        gg.fillRect(1, 1, 3, 3); // menggambar sebuah persegi-panjang terisi
        gg.setColor(Color.RED); // menggambar dengan merah
        gg.fillRect(4, 4, 3, 3); // menggambar sebuah persegi-panjang terisi

        // menggambar buffImage pada jframe
        g2d.setPaint(new TexturePaint(bufferedImage, new Rectangle(10, 10)));
        g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

        // menggambar busur bentuk pie 2D dalam putih
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

        // menggambar garis garis 2D dalam hijau dan kuning
        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395, 30, 320, 150));

        // menggambar garis 2D menggunakan stroke
        float[] dashes = { 10 }; // membuat pola putus-putus
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(320, 30, 395, 150));
    }
}