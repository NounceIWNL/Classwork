package Cycles;

import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.BLUE);
        g2d.clearRect(0, 0, getParent().getWidth(), getParent().getHeight());
        g2d.drawRect(0, 0, 100, 100);
        g2d.setColor(Color.RED);
        g2d.drawRect(0, 0, 10, 10);


    }

    public static void main(String[] args) {
        // create frame for Main
        JFrame frame = new JFrame("Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo app = new GraphicsDemo();
        frame.add(app);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}