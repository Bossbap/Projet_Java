package representation;

import java.io.*;


import univers.Weapons;

/** 
 * Permet de sauvegarder une partie
 * @author Baptiste Geisenberger 
 */
@SuppressWarnings("serial")
public class Saver implements Event, Serializable{
	private DecisionNode currentNode;
	
	public Saver(DecisionNode n) {
		this.currentNode = n;
	}
	
	public void display() {
	}
	
	/**
	 *  Renvoie le premier noeud de la partie. Apres avoir sauvegarde la partie, on recommence une autre des le debut. 
	 */
	public Event choosenext() {
		System.out.println("Etes vous sur de vouloir sauvegarder cette partie? Vous serez renvoyer a l'ecran du debut, et vous pourriez choisir de load cette partie plus tard(y/n)");
		String yn = DecisionNode.s.next();
		while (!yn.equals("y") && !yn.equals("n")) {
			System.out.println("Saisie non reconnue, veuillez resaisir votre reponse (y/n)");
			yn = DecisionNode.s.next();
		}
		if (yn.equals("n")) {
			System.out.println("Compris, on continue sur cette lancee");
			return currentNode;
		}
		this.save();
		System.out.println("Souhaitez vous\n\n(1)Recommencer une partie\n\n(2)Quitter le jeu");
		int choix;
		while (true) {
			while(!DecisionNode.s.hasNextInt()) {
				System.out.println("Veuillez saisir un nombre entre 1 et 2");
				DecisionNode.s.next();
				}
			choix = DecisionNode.s.nextInt();
			if (choix<1 || choix>2) {
				System.out.println("Veuillez saisir un nombre entre 1 et 2");
			}
			else {
				break;
			}
		}
		if (choix == 1) {
			Node.p.varc_silent(100-Node.p.getCash());
			Node.p.varmp_silent(5-Node.p.getMoralpt());
			Node.p.varw(new Weapons(""));
			Node.p.addAllie(null);
			return Node.premier;
		}
		return (new TerminalNode("Fin du jeu"));
	}
	
	/** 
	 * Permet de sauvegarder la partie en sauvegardant l'etat du personnage principal et le noeud courrant.
	 */
	public void save() {
		System.out.println("Veuillez rentrer le nom de votre partie");
		String filename = DecisionNode.s.next();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir")+File.separator+"Sauvegarde"+File.separator+filename + ".txt"))) {
            oos.writeObject(Node.p);
            oos.writeObject(currentNode);
            System.out.println("Votre partie a bien ete sauvegardee au nom de " + filename +"\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
