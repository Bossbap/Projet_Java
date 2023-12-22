package ok;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swag {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Display");
            frame.setSize(400, 400);

            JLabel imageLabel = new JLabel();
            ImageIcon imageIcon = new ImageIcon("/Users/Stephanie/eclipse-workspace/Oui/Images/test.jpg"); // Replace with your image path
            imageLabel.setIcon(imageIcon);

            frame.getContentPane().add(imageLabel);

            Timer timer = new Timer(10000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageLabel.setIcon(null); // Remove the image after 10 seconds
                    ((Timer) e.getSource()).stop(); // Stop the timer
                }
            });

            timer.start(); // Start the timer

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
