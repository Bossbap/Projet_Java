package ok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public GameGUI() {
        // Set the layout manager to BorderLayout
        setLayout(new BorderLayout());

        // Create a title label and add it to the NORTH position
        JLabel titleLabel = new JLabel("\nVoici ta premiere idee. Des rumeurs sont parvenus a tes oreilles: Un bourgeois originaire de Paris vient a Auxerre pour un weekend d'affaire. Tu decides de le deposseder de ses biens.\nComment comptes-tu proceder?\n\n(1)Tu t'introduis dans sa residence lorsque celui-ci dort, et tu prends tout ce qui rentre dans ta besace.\n\n(2)Tu decides d'enlever son enfant et d'exiger une rancon.\n\n(3)Tu sais dans quel auberge il compte souper. Tu vas y aller, te montrer sympathique avec lui, et le faire boire assez pour qu'il ne soit plus trop attentif. Cela fait, tu lui soutireras ces biens, son attention diminuee par l'alcool.\n");
        titleLabel.setHorizontalAlignment(JLabel.CENTER); // Center the title text
        add(titleLabel, BorderLayout.NORTH);

        // Create a panel for the buttons and set its layout manager to GridLayout
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));

        // Initialize buttons
        ImageIcon icon1 = new ImageIcon("/Users/Stephanie/eclipse-workspace/Oui/Images/test.jpg");
        JButton button1 = new JButton(icon1);
        ImageIcon icon2 = new ImageIcon("/Users/Stephanie/eclipse-workspace/Oui/Images/test.jpg");
        JButton button2 = new JButton(icon2);
        ImageIcon icon3 = new ImageIcon("/Users/Stephanie/eclipse-workspace/Oui/Images/test.jpg");
        JButton button3 = new JButton(icon3);

        // Add buttons to the button panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Add the button panel to the CENTER position
        add(buttonPanel, BorderLayout.CENTER);

        // Set up action listeners for the buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("You have picked choice one!");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("You have picked choice two!");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("You have picked choice three!");
            }
        });

        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Your Game Title");
        setSize(600, 400); // Set your preferred size
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
        
    }

    public static void main(String[] args) {
        // Create an instance of the main class
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameGUI();
            }
        });
    }
}
