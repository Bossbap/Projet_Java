package Main;

import representation.*;
import univers.*;
import java.util.Scanner;

public class Histoire {
	
	public Node currentNode;
	
	public static void main(String[] args) {
		
		Histoire h = new Histoire();
		
		Node m1 = new DecisionNode("\nVoici ta premiere idee. Des rumeurs sont parvenus a tes oreilles: Un bourgeois originaire de Paris vient a Auxerre pour un weekend d'affaire. Tu decides de le deposseder de ses biens.\nComment comptes-tu proceder?\n\n(1)Tu t'introduis dans sa residence lorsque celui-ci dort, et tu prends tout ce qui rentre dans ta besace.\n\n(2)Tu decides d'enlever son enfant et d'exiger une rancon.\n\n(3)Tu sais dans quel auberge il compte souper. Tu vas y aller, te montrer sympathique avec lui, et le faire boire assez pour qu'il ne soit plus trop attentif. Cela fait, tu lui soutireras ces biens, son attention diminuee par l'alcool.\n");
		Node m2 = new DecisionNode("\nBien joue! Tu es discret comme un ninja et tes pieds leger comme des plumes. Tu repars avec de l'argent, sa bague et son collier.\n");
		Node m3 = new DecisionNode("\nSuper, son enfant est son monde, la prunelle de ses yeux. Il ne prend pas le risque de te tromper, il te donne 1000 Francs pour recuperer son gosse. Par contre, tu as traumatise un petit.\n");
		Node m4 = new DecisionNode("\nBonne decision. Tu es quelqu'un de sympathique, et lui se sent un peu seul. Il accepte facilement de souper avec toi et, peu habitue a boire, deviens ivre raide. Tu reussi a lui piquer sa bague et des billets dans ses poches. Et en plus de ca il propose de payer ton diner!\n");
		Node m5 = new DecisionNode("\nPour decompresser apres cette histoire, les poches lourdes, tu decides d'aller a l'Auberge des Trois Chevaux, a l'Ouest d'Auxerre. Tu sais quelles genre de personnes frequentent cette institution du monde criminel Auxerrois, et tu te dis que tu vas surement rencontrer quelqu'un qui te donnera de la suite dans tes idees.\nEt en effet, tu ne passes pas ta soiree a chomer. La bas, tu rencontres de nombreuses personnes:/nTu decides de t'associer avec:\n\n(1)Les freres Gilbert\n\n(2)L'association des juveniles auxerrois\n\n(3)Chantal\n\n(4)Personne, tu es mieux accompagne par toi meme.\n");
		Node m6 = new TerminalNode("\nFin du Jeu\n");
		Node m7 = new TerminalNode("\nFin du Jeu\n");
		Node m8 = new TerminalNode("\nFin du Jeu\n");
		Node m9 = new TerminalNode("\nFin du Jeu\n");
		
		Node[] N1 = {m2,m3,m4};
		Node[] N2 = {m5};
		Node[] N3 = {m5};
		Node[] N4 = {m5};
		Node[] N5 = {m6,m7,m8,m9};
		
		m1.setNodes(N1);
		m2.setNodes(N2);
		m3.setNodes(N3);
		m4.setNodes(N4);
		m5.setNodes(N5);
		
		Scanner scanner = new Scanner(System.in);
		m1.setScan(scanner);
		//m2.setScan(scanner);
		//m4.setScan(scanner);
		//m3.setScan(scanner);
		m5.setScan(scanner);
		
		Gang lfg = new Gang("Les freres Gilbert", 2000, "Bien le bonsoir petit voyou. Oses-tu seulement rejoindre notre groupe?");
		Gang aja = new Gang("L'association des juveniles auxerrois", 300, "Regarde toi, t'es jeune comme nous, integre notre groupe.");
		Perso chantal = new Perso("Chantal", 1500, "Mais regardez moi ca, un petit bandit qui cherches a se faire un nom. Tu penses vraiment avoir la taille pour conquerir ce monde?");

		
		
		//Node[] T = {n1,n2,n3,n4,n5,n6,n7,n8,n9};
		
		
		System.out.println("Choisis ton nom brigand.");
		String name = scanner.next();
		Principal player = new Principal(name);
		System.out.println("Salut "+ player.getName() +"!\nTu habites a Auxerre, tu as 16 ans et on est en l'an 1920.\nLa nature t'as gate : Elle t'a dote d'un esprit malicieux et une furieuse envie de conquerir le monde. Mais ce n'est pas gagne, car a part la modique somme de 50 francs et tes poings tu n'as rien.");
		System.out.println("Le but de ce jeu est simple: tu dois gravir les echelons de la societe delinquante francaise. Prends des decisions astucieuses, et devient le nom le plus effrayant de France.\n\nMais attention, tu n'es pas un simple voyou comme les autres. Tu as une conscience morale exacerbee. Fais attention a ne pas trop souiller tes propres principes.\n\n");
		
		
		h.currentNode = m1;
		while (!(h.currentNode instanceof TerminalNode)) {
			h.currentNode.display();
			h.currentNode = h.currentNode.choosenext();
		}		
		h.currentNode.display();
		scanner.close();
	}
}
