package org.dw363;

import javax.swing.*;
import java.awt.*;

public class HelloWorldGUI extends JFrame {

    public HelloWorldGUI() {
        setTitle("Hello World GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(0, 0, Color.BLUE, getWidth(), getHeight(), Color.MAGENTA);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.setFont(new Font("Serif", Font.BOLD, 40));
                g2d.setColor(Color.WHITE);
                g2d.drawString("Hello World!", 100, 150);
            }
        };

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloWorldGUI ex = new HelloWorldGUI();
                ex.setVisible(true);
            }
        });
    }
}