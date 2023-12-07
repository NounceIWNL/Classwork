package Cycles;


import javax.swing.*;
import java.awt.*;

public class CycleFor3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPane());
    }
}

// Create a component that you can actually draw on.
        class DrawPane extends JPanel {
            public void paintComponent(Graphics g) {
                for (int i =0; i < 9; i ++) {
                    g.setColor(Color.GREEN);
                    g.fillRect(50 + 50 * i, 50, 20, 20); // Draw on g here e.g.


                    JLabel jLabel = new JLabel();
                    jLabel.setText(Integer.toString(i+1));
                    jLabel.setBounds(55 + 50 * i, 80, 10, 10);
                    this.add(jLabel);
                }


            }
        }

