package representation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;

import univers.Principal;

/**
 * Loader permet de charger une partie anciennement sauvegarder
 * @author Baptiste Geisenberger
 */
@SuppressWarnings("serial")
public class Loader implements Event,Serializable{
	private DecisionNode currentNode;
	/** 
	 * Liste des parties sauvegardees
	 */
	private List<String> parties = new ArrayList<String>();

		
	public void display() {
	}
	
	public Loader(DecisionNode n) {
		this.currentNode = n;
	}
	
	/** 
	 * Cette implementation de choosenext demande a l'utilisateur quelle partie il veut relancer, et le ramene a ce stade
	 */
	public Event choosenext() {
		System.out.println("Etes vous sur de vouloir charger une partie? N'oubliez pas de sauvegarder la partie actuelle sinon vous perdrez toute progression(y/n)");
		String yn = DecisionNode.s.next();
		while (!yn.equals("y") && !yn.equals("n")) {
			System.out.println("Saisie non reconnue, veuillez resaisir votre reponse (y/n)");
			yn = DecisionNode.s.next();
		}
		if (yn.equals("n")) {
			System.out.println("Compris, on continue sur cette lancee");
			return currentNode;
		}
		this.load();
		return this.currentNode;
	}
	
	/** 
	 * Load charge une partie en fonction du choix de l'utilisateur
	 */
	public void load() {
		this.getParties();
		int cpt = 1;
		for (String p : parties)
			System.out.println("(" + (cpt++) + ") " + p);
		System.out.println("Veuillez choisir le numero correspondant a la partie que vous voulez chargez");
		int choix;
		while (true) {
			while(!DecisionNode.s.hasNextInt()) {
				System.out.println("Veuillez saisir un nombre qui correspond bien a une partie existante.");
				DecisionNode.s.next();
				}
			choix = DecisionNode.s.nextInt();
			if (choix<1 || choix>= parties.size() + 1) {
				System.out.println("Veuillez saisir un nombre qui correspond bien a une partie existante.");
			}
			else {
				break;
			}
		}
		String filename = parties.get(choix-1);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir")+File.separator+"Sauvegarde"+File.separator+filename+".txt"))) {
            Object obj1 = ois.readObject();
            Object obj2 = ois.readObject();
            if (obj1 instanceof Principal) {
            	Node.p = (Principal) obj1;
            	currentNode = (DecisionNode) obj2;
            }
            else {
            	Node.p = (Principal) obj2;
            	currentNode = (DecisionNode) obj1;
            }
            System.out.println("Chargement reussi de la partie: " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
	
	/**
	 * Ajoute les noms de parties a la liste parties
	 */
	public void getParties() {
		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(System.getProperty("user.dir")+File.separator+"Sauvegarde"))) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                	String s = path.getFileName().toString();
                    parties.add(s.substring(0,s.length()-4));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
