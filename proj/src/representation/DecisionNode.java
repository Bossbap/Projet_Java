package representation;

import java.util.Scanner;
import java.io.Serializable;
import univers.*;

/** 
 * DecisionNode represente un stage de la partie ou l'utilisateur doit prendre une decision qui influencera le deroulement de la partie.
 * @author Baptiste Geisenberger
 */

@SuppressWarnings("serial")
public class DecisionNode extends InnerNode implements Serializable{
	
	/**
	 * Scanner qui permet de prendre les reponses de l'utilisateur
	 */
	public static Scanner s;
		
	public DecisionNode(String description) {
		super(description);
	}
	
	/**
	 * Cette implementation de choosenext permet de changer les parametres de notre package univers in-game en fonction du stade du jeu.
	 * Elle permet aussi de recuperer un choix de l'utilisateur, et en fonction, soit elle quitte, sauvegarde ou charge une partie, soit elle avance dans le jeu en renvoyant un prochain noeud.
	 */
	@Override
	public Event choosenext() {
		if (N.size() > 1) {
			p.presentation();
		}
		if (id == 2) {
			p.varc(500);
		}
		if (id == 3) {
			p.varc(1000);
			p.varmp(-1);
		}
		if (id == 4) {
			p.varc(600);
		}
		if (this.id == 6) {
			p.addAllie(mapAllie.get(1));
			mapAllie.get(1).presentation();
			}
		if (id == 7) {
			p.addAllie(mapAllie.get(2));
			mapAllie.get(2).presentation();
		}
		if (id == 8) {
			p.addAllie(mapAllie.get(3));
			mapAllie.get(3).presentation();
		}
		if (id == 7) {
			p.varmp(1);
		}
		if (id == 8) {
			p.varmp(-1);
		}
		if (id == 10) {
			p.varc(-300);
			p.varw(Node.mapW.get(6));
		}
		if (id == 11) {
			p.varc(-400);
			p.varw(Node.mapW.get(3));
		}
		if (id == 12) {
			p.varc(-600);
			p.varw(Node.mapW.get(7));
		}
		if (id == 13) {
			p.varc(-1000);
			p.varw(Node.mapW.get(5));
		}
		if (id == 26) {
			p.varc(1500);
		}
		if (id == 21) {
			p.varc(2000);
		}
		if (id == 27) {
			p.varc(3000);
			p.varmp(-2);
		}
		if (id == 30) {
			p.varc(3000);
		}
		if (id == 34) {
			p.varc(3000);
		}
		if (id == 37) {
			p.varmp(-1);
		}
		if (id == 38) {
			p.varmp(2);
			Objet.alu = true;
		}
		if (id == 41) {
			p.varc(-(4000 - Node.p.getMoralpt()*100));
		}
		if (id == 43) {
			p.varc(-1500);
		}
		if (id == 48) {
			p.varc(-1000);
		}
		if (N.size() == 1) {
			return N.get(0);
		}
		int c;
		while (true) {
			while(!s.hasNextInt()) {
				System.out.println("Veuillez entrer un entier s'il vous plait");
				s.next();
			}
			c = s.nextInt();
			if (c==0) {
				System.out.println("Vous souhaitez:\n(1)Quitter la partie\n\n(2)Sauvegarder la partie actuelle\n\n(3)Charger une autre partie");
				while(true) {
					if(!s.hasNextInt()) {
						System.out.println("Veuillez entrer un entier s'il vous plait");
						s.next();
					}
					c = s.nextInt();
					System.out.println(c);
					if (c<1 || c >3) {
						System.out.println("Veuillez entrer un entier s'il vous plait");
					}
					else {
						if (c==1) {
							return (new TerminalNode("Vous avez quitte la partie"));
						}
						if (c==2) {
							return (new Saver(this));
						}
						return (new Loader(this));
					}
				}
			}
			for (int i = 0; i<this.N.size();i++) {
				if (i+1 == c) {
					return this.N.get(i);
				}
			}
			System.out.println("Votre decision n'est pas dans les choix, veuillez entrer une decision correcte.");
		}
	}
}
