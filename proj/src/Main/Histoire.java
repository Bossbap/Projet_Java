package Main;

import representation.*;
import univers.*;
import java.util.Scanner;
import java.util.HashMap;

public class Histoire {
	
	public Node currentNode;
	public Principal p;
	public HashMap<Integer, Allie> mapAllie = new HashMap<>();
	public HashMap<Integer, Allie> mapOpp = new HashMap<>();
	
	public void chgt() {
		if (currentNode.N.length > 1) {
			p.presentation();
		}
		if (currentNode.id == 2) {
			p.varc(500);
		}
		if (currentNode.id == 3) {
			p.varc(1000);
			p.varmp(-1);
		}
		if (currentNode.id == 4) {
			p.varc(600);
		}
		if (currentNode.id == 6) {
			p.addAllie(mapAllie.get(1));
			}
		if (currentNode.id == 7) {
			p.addAllie(mapAllie.get(2));
		}
		if (currentNode.id == 8) {
			p.addAllie(mapAllie.get(3));
		}
		if (currentNode.id == 7) {
			p.varmp(1);
		}
		if (currentNode.id == 8) {
			p.varmp(-1);
		}
		if (currentNode.id == 10) {
			p.varc(-200);
			p.varw(new Weapons("Poing_Americain"));
		}
		if (currentNode.id == 11) {
			p.varc(-300);
			p.varw(new Weapons("Couteau_de_lancer"));
		}
		if (currentNode.id == 12) {
			p.varc(-300);
			p.varw(new Weapons("Poignard"));
		}
		if (currentNode.id == 13) {
			p.varc(-500);
			p.varw(new Weapons("Sarbacane"));
		}
		if (currentNode.id == 26) {
			p.varc(1500);
		}
		if (currentNode.id == 21) {
			p.varc(2000);
		}
		if (currentNode.id == 27) {
			p.varc(3000);
			p.varmp(-2);
		}
		if (currentNode.id == 30) {
			p.varc(3000);
		}
		if (currentNode.id == 31) {
			Lieu c = new Lieu("clairiere",false);
			if (p.getWeapon().fight(mapOpp.get(1).getWeapon(), c) || p.getAllie().getWeapon().fight(mapOpp.get(1).getWeapon(), c)) {
				p.varc(3000);
			}
			else {
				p.vivant=false;
			}
		}
		if (currentNode.id == 23) {
			
		}
		if (currentNode.id == 23) {
			
		}
		if (currentNode.id == 23) {
			
		}
		if (currentNode.id == 23) {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Histoire h = new Histoire();
		
		
		
		
		
		// ----------------- NODES ----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//On definit les Nodes
		DecisionNode m1 = new DecisionNode("\nVoici ta premiere idee. Des rumeurs sont parvenus a tes oreilles: Un bourgeois originaire de Paris vient a Auxerre pour un weekend d'affaire. Tu decides de le deposseder de ses biens.\nComment comptes-tu proceder?\n\n(1)Tu t'introduis dans sa residence lorsque celui-ci dort, et tu prends tout ce qui rentre dans ta besace.\n\n(2)Tu decides d'enlever son enfant et d'exiger une rancon.\n\n(3)Tu sais dans quel auberge il compte souper. Tu vas y aller, te montrer sympathique avec lui, et le faire boire assez pour qu'il ne soit plus trop attentif. Cela fait, tu lui soutireras ces biens, son attention diminuee par l'alcool.\n");
		DecisionNode m2 = new DecisionNode("\nBien joue! Tu es discret comme un ninja et tes pieds leger comme des plumes. Tu repars avec de l'argent, sa bague et son collier.\n");
		DecisionNode m3 = new DecisionNode("\nSuper, son enfant est son monde, la prunelle de ses yeux. Il ne prend pas le risque de te tromper, il te donne 1000 Francs pour recuperer son gosse. Par contre, tu as traumatise un petit.\n");
		DecisionNode m4 = new DecisionNode("\nBonne decision. Tu es quelqu'un de sympathique, et lui se sent un peu seul. Il accepte facilement de souper avec toi et, peu habitue a boire, deviens ivre raide. Tu reussi a lui piquer sa bague et des billets dans ses poches. Et en plus de ca il propose de payer ton diner!\n");
		DecisionNode m5 = new DecisionNode("\nPour décompresser après cette histoire, tu vas dans le bar des quartiers sombres d'Auxerre, à l'abri des regards. De sacrés personnages y sont présents, tu décides de te faire un allié pour la suite de ton aventure.\n\n(1) Chantal, c'est une vraie bastonneuse dans l'âme, n'a pas peur de s'attaquer à plus grand qu'elle et vise les couilles quand ça va mal.\n\n(2)Les freres Gibert: jeunes et beau, ils utilisent de leur charme et leur malice.\n\n(3)Dominique Apagnan, un chimiste au bord de la folie.\n");
		DecisionNode m6 = new DecisionNode("\nChantal accepte ta proposition: 'Heureuse de faire partie de ton équipe, jeune brigand'. Elle se bat avec les POINGS.\n");
		DecisionNode m7 = new DecisionNode("\nTu viens de rejoindre les frères Gilbert, ils t'accueillent avec leurs plus beaux sourires. Ils se battent au COUTEAU_DE_LANCER. Tu profites de leur bonne réputation.\n");
		DecisionNode m8 = new DecisionNode("\nMr Apagnan, le regard injecté de sang, a l'air vraiment content de suivre ta route. Il utilise une MACHETTE. Sa mauvaise réputation n'aide pas la tienne maintenant que vous êtes ensemble.");
		DecisionNode m9 = new DecisionNode("\nTe voilà bien accompagné, il te faut maintenant t'équiper à l'armurerie, tu as le choix entre des armes de combat rapproché et à distance. Choisis bien, en prenant compte de l'arme de ton compagnon que tu peux aussi utiliser.\n\n(1) Poing_Americain 200 Francs\n\n(2) COUTEAU_DE_LANCER 300 Francs\n\n(3) POIGNARD 300 Francs\n\n(4) SARBACANE 500 Francs");
		DecisionNode m10 = new DecisionNode("\nTe voici muni d'un Poing_Americain, une arme de combat rapproché\n");
		DecisionNode m11 = new DecisionNode("\nTe voici muni d'un couteau de lancer, une arme à distance\n");
		DecisionNode m12 = new DecisionNode("\nTe voici muni d'un poignard, une arme de combat rapproche\n");
		DecisionNode m13 = new DecisionNode("\nTe voici muni d'une sarbacane, une arme à distance\n");
		DecisionNode m14 = new DecisionNode("\nTu es maintenant bien entourée et fin prêt à affronter les défis qui t'attendent! Deux aventures s'offrent à toi: braquer la banque d'Auxerre ou bien affronter Eric Crampté, le plus gros contrebandier de la région, qui fait régner la terreur.\n\n(1) Tu décides de braquer la banque.\n\n(2)Tu préfères t'attaquer à Crampté le contrebandier.\n\n");
		DecisionNode m15 = new DecisionNode("\nUn braquage, voilà qui peut rapporter beaucoup; encore faut il s'en sortir vivant. Il s'agira de savoir utiliser les forces de ton équipe. Comment comptez vous vous occuper des gardes?\n\n(1)Vous choisissez la méthode forte en essayant de les assommer.\n\n(2)Vous décidez de tromper leur vigilance en les faisant boire jusqu'à ce qu'ils perdent leurs appuis.\n\n(3)Vous décidez d'observer les tours de garde en espérant trouver une ouverture.\n\n");
		InnerNode m16 = new InnerNode("");
		InnerNode m17 = new InnerNode("");
		InnerNode m18 = new InnerNode("");
		DecisionNode m19 = new DecisionNode("\nA la force des bras, Chantal maîtrise les trois gardiens et les mets au tapis, sans connaissance. Tu n'as pas servi à grand chose mais le danger est passé!\n");
		Node m20 = new TerminalNode("\nLe combat s'engage, tu comprends vite que ton équipe n'est pas la plus bagarreuse et que tu dois t'en sortir par toi même... Tu échoues misérablement étant donné ton physique très peu avantageux.\nGAME OVER\n");
		DecisionNode m21 = new DecisionNode("\nLes gardes sont ravis de partager un verre (ou deux) avec de si charmants garçons, ils ne se méfient de rien et très vite s'endorment sous l'effet de l'alcool. Vous pouvez continuer!\n");
		Node m22 = new TerminalNode("\nLes gardes ne vous trouvent pas du tout sympathiques et n'ont pas la moindre envie de passer du temps avec vous, une tentative de trop de votre part les énerve et ils sortent leurs armes.\nGAME OVER\n");
		DecisionNode m23 = new DecisionNode("\nDominique est un scientifique aguerri, il est méthodique, patient et très malin. Il trouve vite le défaut dans la ronde des gardiens: à 9h le lundi, la route est libre pendant deux minutes. Vous profitez de cette ouverture pour vous introduire dans la banque.\n");
		Node m24 = new TerminalNode("\nVotre équipe n'est pas organisée, et osons le dire vous n'êtes pas spécialement affuté en terme d'intelligence. Un jour, vous voyez une absence de gardes à 15h, et vous partez du principe que ce sera le cas le lendemain. Les choses se passent différemment et vous vous faites arrêter.\nGAME OVER\n");
		DecisionNode m25 = new DecisionNode("\nVous voici à l'intérieur de la banque, il n'y a plus que toi et le caissier. Comment continuez vous votre plan?\n\n(1) Tu promets la moitié des revenus au caissier s'il te laisse accéder au coffre.\n\n(2)Tu le menaces de le tuer, lui et toute sa famille, s'il ne te laisse pas entrer.\n\n(3)Tu te mets à danser pour voir ce que ça peut donner.\n\n");
		DecisionNode m26 = new DecisionNode("\nLe caissier accepte ton offre, il en a marre de voir tant d'argent mais de n'être payé que trois francs six sous. Bien joué! Tu repars te planquer avec 3000 francs, dont tu devras perdre la moitié car tu es un homme de parole.\n");
		DecisionNode m27 = new DecisionNode("\nMalgré ton manque de charisme, le caissier a peur pour ses enfants donc il te laisse accéder au coffre. Tu repars avec la belle somme de 3000 francs, mais ton honneur en prend un grand coup, car tu as menacé un innocent d'atroces choses. Attention, cela pourrait te retomber dessus\n");
		Node m28 = new TerminalNode("\nTu te mets à danser, le caissier ne comprend pas ce qui arrive, la police non plus quand elle arrive mais elle ne se pose pas plus de questions et tu finis criblé de balles. Tu croyais qu'il allait se passer quoi?\nGAME OVER\n");
		DecisionNode m29 = new DecisionNode("\nTu parles de ton plan a des amis au bar, mais les murs ont des oreilles et l'info remonte jusqu'au terrible Eric. C'est la première fois qu'on le menace et il veux faire de toi un exemple tout en assurant sa réputation d'homme sans peur. Il te mets au défi, en te laissant deux options:\n\n(1)Une roulette russe, entre lui et toi.\n\n(2) Un combat à distance, sachant qu'il se bat à la sarbacane.\n\n");
		Node m30 = new ChanceNode("\nLa roulette commence, c'est extrêmement angoissant. Qui va s'en sortir?\n");
		DecisionNode m31 = new DecisionNode("\nVous convenez d'un rendez-vous, dans une grande clairière au milieu des bois. Vous vous mettez à distance et le combat commence.\n");
		DecisionNode m32 = new DecisionNode("\nApres deux tours sans balle, c'est M. Crampté qui manque de chance et finit avec un grand trou dans la tête. Tu as gagné ton duel! Tu repars avec 3000 francs.\n");
		Node m33 = new TerminalNode("\nC'est à toi: clic, puis à lui: clic, puis à toi\nGAME OVER");
		DecisionNode m34 = new DecisionNode("\nTon arme était plus efficace et tu remportes le combat. Tu as gagné ton duel! Tu repars avec 3000 francs.\n");
		Node m36 = new TerminalNode("\nVoilà une belle chose de faite. Tu sens que tu es limité dans ton potentiel si tu restes dans cette ville de provinciaux. Tu décides donc de faire route vers Paris, où l'argent et la célébrité n'attendent que toi.\n");
		//Node m37 = new DecisionNode();
		//Node m38 = new DecisionNode();
		//Node m39 = new DecisionNode();

		TerminalNode mort = new TerminalNode("Mort au combat, une fin que tu aurais pu eviter. Quand tu pars au combat, essaye d'avoir une arme adapte au lieu et plus puissante que celle de ton adversaire.\nGAME OVER\n\n");
		TerminalNode sanssous = new TerminalNode("Un ganster sans le sou? On aura tout vu.\nEssaye de mieux gerer tes depense la prochaine fois\nGAME OVER");
		TerminalNode immoral = new TerminalNode("Rappelle toi, tu n'es pas comme les autres. Trop d'actions immorales ont pese sur ta conscience et ronge par la culpabilite, tu te suicides.\nGAME OVER");
		//Event intro = new ImageNode(m1, "/Users/Stephanie/eclipse-workspace/Oui/Images/test.jpg");
		
		//On definit les choix qui suivent les Nodes
		
		Node[] N1 = {m2,m3,m4};
		Node[] N2 = {m5};
		Node[] N3 = {m5};
		Node[] N4 = {m5};
		Node[] N5 = {m6,m7,m8};
		Node[] N6 = {m9};
		Node[] N7 = {m9};
		Node[] N8 = {m9};
		Node[] N9 = {m10,m11,m12,m13};
		Node[] N10 = {m14};
		Node[] N11 = {m14};
		Node[] N12 = {m14};
		Node[] N13 = {m14};
		Node[] N14 = {m15,m29};
		Node[] N15 = {m16,m17,m18};
		Node[] N16 = {m19,m20};
		Node[] N17 = {m21,m22};
		Node[] N18 = {m23,m24};
		Node[] N19 = {m25};
		Node[] N21 = {m25};
		Node[] N23 = {m25};
		Node[] N25 = {m26,m27,m28};
		Node[] N26 = {m36};
		Node[] N27 = {m36};
		Node[] N29 = {m30,m31};
		Node[] N30 = {m32,m33};
		Node[] N31 = {m34};
		Node[] N32 = {m36};
		Node[] N34 = {m36};
		/*Node[] N36 = {};
		Node[] N37 = {};
		Node[] N38 = {};
		Node[] N39 = {};
		Node[] N40 = {};
		Node[] N341 = {};*/





		
		m1.setNodes(N1);
		m2.setNodes(N2);
		m3.setNodes(N3);
		m4.setNodes(N4);
		m5.setNodes(N5);
		m6.setNodes(N6);
		m7.setNodes(N7);
		m8.setNodes(N8);
		m9.setNodes(N9);
		m10.setNodes(N10);
		m11.setNodes(N11);
		m12.setNodes(N12);
		m13.setNodes(N13);
		m14.setNodes(N14);
		m15.setNodes(N15);
		m16.setNodes(N16);
		m17.setNodes(N17);
		m18.setNodes(N18);
		m19.setNodes(N19);
		m21.setNodes(N21);
		m23.setNodes(N23);
		m25.setNodes(N25);
		m26.setNodes(N26);
		m27.setNodes(N27);
		m29.setNodes(N29);
		m30.setNodes(N30);
		m31.setNodes(N31);
		m32.setNodes(N32);
		m34.setNodes(N34);
		
		//On ajout scanner aux nodes
		
		Scanner scanner = new Scanner(System.in);
		DecisionNode.s = scanner;

		
		
		
	
		
// ------ UNIVERS ----------------------------------------------------------------------------------------------------------------------------------------------------------------

		
		
		
		//On definit les personnages
		
		Perso chantal = new Perso("Chantal", 1500, "Mais regardez moi ca, un petit bandit qui cherches a se faire un nom. Tu penses vraiment avoir la taille pour conquerir ce monde?",new Weaponl("Pistolet"));
		Perso apagnan = new Perso("Dominique Apagnan", 2, "Hahahahaha rejoins moi pour conquerir le MONDE!", new Weapons("Poings"));
		Perso boss_lfg = new Perso("Monsieur Gilbert", 2000, "Etant oriente objet, je cherche a collectionner les artefacts les plus rares de France.", new Weapons("Poings"));
		//Perso boss_aja = new Perso("Guy Roux", 300, "Je suis le boss de l'aja, communement appele l'association des juveniles auxerrois",new Weapons("Poignard"));
		Perso crampte = new Perso("Eric Crampte", 3000, "Peuh, que des minables", new Weaponl("Couteau_de_Lancer"));
		
		
		//On definit les gangs
		
		Gang lfg = new Gang("Les freres Gilbert", 2000, "Bien le bonsoir petit voyou. Oses-tu seulement rejoindre notre groupe?",boss_lfg,new Weapons("Poings"));
		//Gang aja = new Gang("L'association des juveniles auxerrois", 300, "Regarde toi, t'es jeune comme nous, integre notre groupe.",boss_aja, new Weaponl("SARBACANE"));
		
		
		
		//Init du jeu
		System.out.println("Choisis ton nom brigand.");
		String name = scanner.next();
		Weapon wp = new Weapons("Poings");
		h.p = new Principal(name,wp);
		Node.p = h.p;
		
		h.mapAllie.put(Integer.valueOf(1),chantal);
		h.mapAllie.put(Integer.valueOf(2),lfg);
		h.mapAllie.put(Integer.valueOf(3),apagnan);
		
		h.mapOpp.put(Integer.valueOf(1), crampte);
		//h.mapOpp.put(Integer.valueOf(2), crampte);
		//h.mapOpp.put(Integer.valueOf(3), crampte);

		
		
		
		System.out.println("Salut "+ h.p.getName() +"!\nTu habites a Auxerre, tu as 16 ans et on est en l'an 1920.\nLa nature t'as gate : Elle t'a dote d'un esprit malicieux et une furieuse envie de conquerir le monde. Mais ce n'est pas gagne, car a part la modique somme de 50 francs et tes poings tu n'as rien.");
		System.out.println("Le but de ce jeu est simple: tu dois gravir les echelons de la societe delinquante francaise. Prends des decisions astucieuses, et devient le nom le plus effrayant de France.\n\nMais attention, tu n'es pas un simple voyou comme les autres. Tu as une conscience morale exacerbee. Fais attention a ne pas trop souiller tes propres principes.\n\n");
		System.out.println("Voici ton profil\n");
		h.p.presentation();
		System.out.println("\nTu auras acces a ton profil, et tu verras que tes decisions influenceront les parametres de ton profil. Gere les bien sinon ta partie sera de courte duree.");
		System.out.println("\n\n-----------------------------------------------------------------------------------------------\n\n\n\n\n\nPret pour commencer la partie?(y/n)");
		String yn = scanner.next();
		while (!yn.equals("y") && !yn.equals("n")) {
			System.out.println("Saisie non reconnue, veuillez resaisir votre reponse (y/n)");
			yn = scanner.next();
		}
		if (yn.equals("n")) {
			System.out.println("Merci, une autre fois peut-etre!");
			System.exit(0);
		}
		
		h.currentNode = m1;
		while (!(h.currentNode instanceof TerminalNode) && (h.p.vivant)) {
			h.currentNode.display();
			h.currentNode = h.currentNode.choosenext();
			h.chgt();
		}
		if (!h.p.vivant) {
			h.currentNode = mort;
		}
		if (h.p.getCash() <= 0) {
			h.currentNode = sanssous;
		}
		if (h.p.getMoralpt() <= 0) {
			h.currentNode = immoral;
		}
		h.currentNode.display();
		scanner.close();
	}
}
