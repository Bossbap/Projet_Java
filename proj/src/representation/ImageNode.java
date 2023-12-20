package representation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageNode extends NodeDecorator{
	private Node nextNode;
	private String path;
	
	public ImageNode(Node n,String p) {
		nextNode = n;
		path = p;
	}
	
	@Override
	public void display() {
		SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Display");
            frame.setSize(400, 400);

            JLabel imageLabel = new JLabel();
            ImageIcon imageIcon = new ImageIcon(this.path); // Replace with your image path
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
	
	@Override
	public Node choosenext() {
		return nextNode;
	}
}
