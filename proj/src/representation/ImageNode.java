package representation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;


/**
 * ImageNode permet d'afficher une image.
 * @author Baptiste Geisenberger
 */

@SuppressWarnings("serial")
public class ImageNode extends NodeDecorator implements Serializable{
	private Event nextNode;
	private String path;
	
	/**
	 * Constructeur de classe qui permet de donner le prochain noeud dans la partie ainsi que le chemin du fichier image a ouvrir.
	 * @param n prochain noeud de la partie
	 * @param p chemin du fichier a ouvrir
	 */
	public ImageNode(Event n,String p) {
		nextNode = n;
		path = p;
	}
	
	
	/** 
	 * Affiche l'image dans le chemin p, puis la fais disparaitre apres 10 secondes
	 */
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
	public Event choosenext() {
		return nextNode;
	}
}
