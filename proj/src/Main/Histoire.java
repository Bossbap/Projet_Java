package main;

import representation.*;
import univers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.io.File;
import java.util.Scanner;

/** 
 * Histoire est notre fonction main. On y initialise tous les noeuds possible de notre partie, ainsi que les personnages et les elements de notre package univers qui vont influencer le jeu.
 * @author Baptiste Geisenberger & Hector Moreau
 */

public class Histoire {
	
	/**
	 * La structure de notre fonction main est la suivante:
	 * On introduis le jeu et on initalise le personnage principal
	 * On initalise ensuite tous les noeuds et leur fils.
	 * On initialise tous les personnages de notre package univers
	 * On introduis ensuite la boucle principal de notre programme, qui ne s'arrete uniquement si on rencontre un TerminalNode ou alors si l'utilisateur a mal gere ses parametres.
	 */

	
	public static void main(String[] args) {
		
// ---- Premiere presentation ----------------------------------------------------------------------------------------------------------------------------------------------------------------	
		
		System.out.println("Choisis ton nom brigand.");
		Scanner scanner = new Scanner(System.in);
		String nom = scanner.nextLine();
		Weapon wp = new Weapons("Poings");
		Principal princ = new Principal(nom,wp);
		Node.p = princ;
		System.out.println("\n\n");
		princ.presentation();
		


		
// ---- NODES ----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//On definit les Nodes
		Node.nbnoeuds = 0;
		DecisionNode intro = new DecisionNode("\n\nSalut "+ princ.getName() +"!\nCi-dessus tu peux voir ton profil\n. Il s'affichera des que tu dois prendre une decision. Au fur et a mesure de l'histoire, tu verras que ton profil evoluera.\n\n\nEt maintenant, introduisons le contexte de ton histoire.\nTu habites a Auxerre, tu as 16 ans et on est en l'an 1920.\nLa nature t'as gate : Elle t'a dote d'un esprit malicieux et d'une furieuse envie de conquerir le monde. Mais ce n'est pas gagne, car a part la modique somme de 100 francs et tes robustes poings tu n'as rien.\nLe but de ce jeu est simple: tu dois gravir les echelons de la societe delinquante francaise. Prends des decisions astucieuses, et devient le nom le plus effrayant de France.\nMais attention, tu n'es pas un simple voyou comme les autres. Tu as une conscience morale exacerbee. Fais attention a ne pas trop souiller tes propres principes.\n\n\n\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n\n\nPret pour commencer la partie?\n\n(1)oui\n\n(2)non\n");
		DecisionNode m1 = new DecisionNode("\nVoici ta premiere idee. Des rumeurs sont parvenus a tes oreilles: Un bourgeois originaire de Paris vient a Auxerre pour un weekend d'affaire. Tu decides de le deposseder de ses biens.\nComment comptes-tu proceder?\n\n(1)Tu t'introduis dans sa residence lorsque celui-ci dort, et tu prends tout ce qui rentre dans ta besace.\n\n(2)Tu decides d'enlever son enfant et d'exiger une rancon.\n\n(3)Tu sais dans quel auberge il compte souper. Tu vas y aller, te montrer sympathique avec lui, et le faire boire assez pour qu'il ne soit plus trop attentif. Cela fait, tu lui soutireras ces biens, son attention diminuee par l'alcool.\n\n(0)autre\n");
		DecisionNode m2 = new DecisionNode("\nBien joue! Tu es discret comme un ninja et tes pieds leger comme des plumes. Tu repars avec de l'argent, sa bague et son collier.");
		DecisionNode m3 = new DecisionNode("\nSuper, son enfant est son monde, la prunelle de ses yeux. Il ne prend pas le risque de te tromper, il te donne 1000 Francs pour recuperer son gosse. Par contre, tu as traumatise un petit.\n");
		DecisionNode m4 = new DecisionNode("\nBonne decision. Tu es quelqu'un de sympathique, et lui se sent un peu seul. Il accepte facilement de souper avec toi et, peu habitue a boire, deviens ivre raide. Tu reussi a lui piquer sa bague et des billets dans ses poches. Et en plus de ca il propose de payer ton diner!\n");
		DecisionNode m5 = new DecisionNode("\nPour décompresser après cette histoire, tu vas dans le bar des quartiers sombres d'Auxerre, à l'abri des regards. De sacrés personnages y sont présents, tu décides de te faire un allié pour la suite de ton aventure.\n\n(1) Chantal, c'est une vraie bastonneuse dans l'âme, n'a pas peur de s'attaquer à plus grand qu'elle et vise les couilles quand ça va mal.\n\n(2)Les freres Gibert: jeunes et beaux, ils utilisent de leur charme et leur malice.\n\n(3)Dominique Apagnan, un chimiste au bord de la folie.\n\n(0)autre\n");
		DecisionNode m6 = new DecisionNode("\nProfil de Chantal");
		DecisionNode m7 = new DecisionNode("\nSalut jeune voyou! Heureux de faire ta connaissance, tu vas voir, on ira loin ensemble. Seulement tiens toi pret a nous suivre...");
		DecisionNode m8 = new DecisionNode("\nProfil de Dominique Apagnan");
		DecisionNode m9 = new DecisionNode("\nTe voilà bien accompagné, il te faut maintenant t'équiper à l'armurerie, tu as le choix entre des armes de combat rapproché et à distance. Les armes plus cheres sont plus puissantes. Si tu tombes sur quelqu'un qui veut ta peau, tu peux utiliser l'arme de ton compagnon, donc n'hesite pas a choisir une arme complementaire a la sienne!\n\n(1) COUTEAU_DE_LANCER 300 Francs\n\n(2) POIGNARD 400 Francs\n\n(3) SARBACANE 600 Francs\n\n(4) EPEE 1000 Francs\n\n(0)autre\n");
		DecisionNode m10 = new DecisionNode("\nTe voici muni d'un couteau de lancer, une arme à distance\n");
		DecisionNode m11 = new DecisionNode("\nTe voici muni d'un poignard, une arme de combat rapproche\n");
		DecisionNode m12 = new DecisionNode("\nTe voici muni d'une sarbacane, une arme à distance\n");
		DecisionNode m13 = new DecisionNode("\nTe voici muni d'une Epee, une arme de combat rapproché\n");
		DecisionNode m14 = new DecisionNode("\nTu es maintenant bien entourée et fin prêt à affronter les défis qui t'attendent! Deux aventures s'offrent à toi: braquer la banque d'Auxerre ou bien affronter Eric Crampté, le plus gros contrebandier de la région, qui fait régner la terreur.\n\n(1) Tu décides de braquer la banque.\n\n(2)Tu préfères t'attaquer à Crampté le contrebandier.\n\n(0)autre\n\n");
		DecisionNode m15 = new DecisionNode("\nUn braquage, voilà qui peut rapporter beaucoup; encore faut il s'en sortir vivant. Il s'agira de savoir utiliser les forces de ton équipe. Comment comptez vous vous occuper des gardes?\n\n(1)Vous choisissez la méthode forte en essayant de les assommer.\n\n(2)Vous décidez de tromper leur vigilance en les faisant boire jusqu'à ce qu'ils perdent leurs appuis.\n\n(3)Vous décidez d'observer les tours de garde en espérant trouver une ouverture.\n\n(0)autre\n\n");
		InnerNode m16 = new InnerNode("");
		InnerNode m17 = new InnerNode("");
		InnerNode m18 = new InnerNode("");
		DecisionNode m19 = new DecisionNode("\nA la force des bras, Chantal maîtrise les trois gardiens et les mets au tapis, sans connaissance. Tu n'as pas servi à grand chose mais le danger est passé!\n");
		Node m20 = new TerminalNode("\nLe combat s'engage, tu comprends vite que ton équipe n'est pas la plus bagarreuse et que tu dois t'en sortir par toi même... Tu échoues misérablement étant donné ton physique très peu avantageux.\nGAME OVER\n");
		DecisionNode m21 = new DecisionNode("\nLes gardes sont ravis de partager un verre (ou deux) avec de si charmants garçons, ils ne se méfient de rien et très vite s'endorment sous l'effet de l'alcool. Vous pouvez continuer!\n");
		Node m22 = new TerminalNode("\nLes gardes ne vous trouvent pas du tout sympathiques et n'ont pas la moindre envie de passer du temps avec vous, une tentative de trop de votre part les énerve et ils sortent leurs armes.\nGAME OVER\n");
		DecisionNode m23 = new DecisionNode("\nDominique est un scientifique aguerri, il est méthodique, patient et très malin. Il trouve vite le défaut dans la ronde des gardiens: à 9h le lundi, la route est libre pendant deux minutes. Vous profitez de cette ouverture pour vous introduire dans la banque.\n");
		Node m24 = new TerminalNode("\nVotre équipe n'est pas organisée, et osons le dire vous n'êtes pas spécialement affuté en terme d'intelligence. Un jour, vous voyez une absence de gardes à 15h, et vous partez du principe que ce sera le cas le lendemain. Les choses se passent différemment et vous vous faites arrêter.\nGAME OVER\n");
		DecisionNode m25 = new DecisionNode("\nVous voici à l'intérieur de la banque, il n'y a plus que toi et le caissier. Comment continuez vous votre plan?\n\n(1) Tu promets la moitié des revenus au caissier s'il te laisse accéder au coffre.\n\n(2)Tu le menaces de le tuer, lui et toute sa famille, s'il ne te laisse pas entrer.\n\n(3)Tu te mets à danser pour voir ce que ça peut donner.\n\n(0)autre\n\n");
		DecisionNode m26 = new DecisionNode("\nLe caissier accepte ton offre, il en a marre de voir tant d'argent mais de n'être payé que trois francs six sous. Bien joué! Tu repars te planquer avec 3000 francs, dont tu devras perdre la moitié car tu es un homme de parole.\n");
		DecisionNode m27 = new DecisionNode("\nMalgré ton manque de charisme, le caissier a peur pour ses enfants donc il te laisse accéder au coffre. Tu repars avec la belle somme de 3000 francs, mais ton honneur en prend un grand coup, car tu as menacé un innocent d'atroces choses. Attention, cela pourrait te retomber dessus\n");
		Node m28 = new TerminalNode("\nTu te mets à danser, le caissier ne comprend pas ce qui arrive, la police non plus quand elle arrive mais elle ne se pose pas plus de questions et tu finis criblé de balles. Tu croyais qu'il allait se passer quoi?\nGAME OVER\n");
		DecisionNode m29 = new DecisionNode("\nTu parles de ton plan a des amis au bar, mais les murs ont des oreilles et l'info remonte jusqu'au terrible Eric. C'est la première fois qu'on le menace et il veux faire de toi un exemple tout en assurant sa réputation d'homme sans peur. Il te mets au défi, en te laissant deux options:\n\n(1)Une roulette russe, entre lui et toi.\n\n(2) Un combat à distance, sachant qu'il se bat à la sarbacane.\n\n(0)autre\n\n");
		Node m30 = new ChanceNode("\nLa roulette commence, c'est extrêmement angoissant. Qui va s'en sortir?\n");
		InnerNode m31 = new InnerNode("\nVous convenez d'un rendez-vous, dans une grande clairière au milieu des bois. Vous vous mettez à distance et le combat commence.\n");
		DecisionNode m32 = new DecisionNode("\nApres deux tours sans balle, c'est M. Crampté qui manque de chance et finit avec un grand trou dans la tête. Tu as gagné ton duel! Tu repars avec 3000 francs.\n");
		Node m33 = new TerminalNode("\nC'est à toi: clic, puis à lui: clic, puis à toi\nGAME OVER");
		DecisionNode m34 = new DecisionNode("");
		TerminalNode m35 = new TerminalNode("Mort au combat, une fin que tu aurais pu eviter. Quand tu pars au combat, essaye d'avoir une arme adapte au lieu et plus puissante que celle de ton adversaire.\nGAME OVER\n\n");;
		DecisionNode m36 = new DecisionNode("\nVoilà une belle chose de faite. Tu sens que tu es limité dans ton potentiel si tu restes dans cette ville de provinciaux. Tu décides donc de faire route vers Paris, où l'argent et la célébrité n'attendent que toi.\nVous montez dans une voiture, que tu as \"empruntée\" à un noble qui laissait reposer ses chevaux sans surveillance, et le voyage commence. Vous longez l'Yonne, puis la Seine, quand le brouillard vous tombe dessus et vous oblige à rouler au pas. C'est à ce moment qu'une ombre vous interpelle: \"Laissez moi voyager avec vous, je vous prie! Nous allons dans la même direction mais il fait bien mauvais temps pour être seule.\" La voix est celle d'une vieille femme. Que décides-tu?\n\n(1) Tu continues ton chemin sans prêter attention à l'inconnue.\n\n(2) Tu acceptes la demande de l'inconnue, il vous reste une place.\n\n(3) Tu décides de voler cette personne, qui possède peut-être quelques richesses.\n");
		DecisionNode m37 = new DecisionNode("Tu passes ton chemin et continues ta route. Bientôt le brouillard se lève.\n");
		DecisionNode m38 = new DecisionNode("La grand-mère est ravie que tu l'aides, elle monte avec un chien noir que tu n'avais pas vu à cause du brouillard, et se présente: 'Je suis D. Monique, merci pour votre hospitalité, je dois me rendre à Créteil pour un accouchement. Votre aide est précieuse. Voici pour vous remercier une amulette, qui pourra vous porter chance si votre sort repose sur le hasard.' Vous prenez l'objet. Le brouillard se lève, vous déposez Monique à Créteil en lui souhaitant bonne chance.\n");
		TerminalNode m39 = new TerminalNode("Tu arrêtes la voiture et menace la grand-mère. Tu te rends compte qu'elle a un chien avec elle. 'La vieille, donne nous tout ce que tu as, et vite'. Au lieu de te répondre, elle se met à marmonner d'étranges syllabes: 'Virelith skarnis, aethyr shora. Abyssalith, nycthramos soria' Son chien se met alors à grossir et deviens un monstre de plusieurs mètres de haut. La morale de l'histoire? Ne jamais s'attaquer aux grand-meres.\nGAME OVER\n");
		DecisionNode m40 = new DecisionNode("Après quelques heures de route supplémentaires, vous voilà rendus aux portes de Paris, où des gardes examinent les voyageurs et demandent un impôt. Paris est une ville où l'on sait apprécier les personnes de bonne valeur, et la somme demandée à l'entrée dépend grandement de vos actions passées. Vous décidez:\n\n(1) De vous présenter aux portes et de payer ce que l'on vous demande.\n\n(2) De trouver un autre moyen pour entrer.\n\n");
		DecisionNode m41 = new DecisionNode("Vous vous présentez aux portes, et payez la somme requise. Ca fait mal au portemonnaie\n");
		DecisionNode m42 = new DecisionNode("Tu fais le tour de la ville à la recherche d'une entrée non gardée. Tu trouves une seule option, un petit tunnel sinistre qui rentre dans la ville, occupé par d'étranges personnages. Tu descend de ta voiture et tu rentres dans le tunnel. A mi-chemin, tu rencontre un homme. Il est habillé vaguement comme les gardes, mais son uniforme est sale et abîmé. Il t'interpelle: 'Je suis un garde de la ville, croyais-tu pouvoir échapper aux contrôles? C'est 1500 francs pour passer.' Que décides-tu de faire?\n\n(1) Tu acceptes de payer afin de rentrer sans poser de problèmes.\n\n(2) Tu ne crois pas qu'il soit un garde et tu n'acceptes pas de payer, même si cela veut dire engager un combat.\n");
		DecisionNode m43 = new DecisionNode("Tu payes et continues d'avancer sur le pont\n");
		InnerNode m44 = new InnerNode("Tu avais raison, ce n'était pas un vrai garde. Il sort son arme, c'est une machette. Le combat entre toi et lui s'engage.\n");
		DecisionNode m45 = new DecisionNode("Tu as gagné ce combat, félicitations. Tu continues d'avancer sur le pont.\n");
		TerminalNode m46 = new TerminalNode("Le faux garde -- malgré sa fatigue et sa faim et son manque d'expérience --, t'as battu à plate couture. Tu es décédé.\nGAME OVER\n");
		DecisionNode m47 = new DecisionNode("Tu arrives jusqu'au deuxième personnage, qui est déguisé en clown et est assis à une table avec trois gobelets. 'Je suis Gigglebert le farceur, et pour passer tu dois me payer 1000 francs ou bien essayer de trouver dans quel gobelet se trouve ma balle, après que je les ai mélangés devant tes yeux. Je t'assure que pour notre bien à tous il vaut mieux que acceptes l'une de ces deux options'. Il dit cette dernière phrase d'un air vraiment inquiétant. Que fais-tu?\n\n(1) Tu le payes, ses jeux ne t'inspirent pas confiance.\n\n(2) Tu joues à son jeu, et acceptes de renoncer à ton aventure en cas d'échec.\n\n(3) Tu utilises un objet spécial.\n\n(4) Tu n'as pas peur de ce pauvre clown et décides de passer en force.\n\n");
		DecisionNode m48 = new DecisionNode("Tu le payes et termines ta traversée du pont.\n");
		ChanceNode m49 = new ChanceNode("Il te présente la balle, la met sous l'un des deux gobelets et commence à les bouger sur la table. Son geste s'accélère et bientôt tu ne vois plus que du flou coloré, tu n'as aucune idée de quel gobelet est le bon. Il faut tout de même choisir, et tu chois celui de gauche...");
		InnerNode m50 = new InnerNode("Tu utilises ton AMULETTE, gagnée grâce à ta gentillesse. Le clown mélange les gobelets mais tu sais que tu choisiras le bon. C'est en effet ce qui arrive, et tu continues ta traversée du pont.\n");
		TerminalNode m51 = new TerminalNode("'Laisse-nous passer, le clown. Tu fais pas le poids.' Il répond: 'Non c'est vrai, mais je suis à domicile'. Il enchaîne avec un grand rire machiavélique, et allume une mèche qui passe sous le pont. Elle est reliée à de nombreux explosifs: le pont disparaît sous les déflagrations, et toi avec.\nGAME OVER\n");
		DecisionNode m52 = new DecisionNode("... et le gobelet de gauche etait bon, bien vu! Tu termines ta traversée du pont.\n");
		TerminalNode m53 = new TerminalNode("... et le gobelet de gauche n'etait pas le bon, en dessous il y a le clown en tout petit qui te regarde d'un air mecontent. D'un rire maniaque, il te dit \"better luck next time!\" et avant que tu comprennes ce qu'il se passe, il te saute a la gorge.\nGAME OVER\n");
		DecisionNode m54 = new DecisionNode("Enfin rendu a Paris! Tu t'installes dans une petite auberge parisienne. Après plusieurs semaines à la recherche d'opportunités qui te permettraient d'avancer, tu te rends compte que Paris est une ville difficile à naviguer sans connexions. Tu passes une partie de ton temps dans une librairie à lire des livres sans les acheter. Un autre personnage est tout le temps là en même temps que toi: James Gosling, un homme de toute petite taille. Un soir, James t'adresse la parole: 'Ca me fait plaisir de voir que la jeunesse apprécie encore la lecture! J'ai remarqué que tu choisis les mêmes livres que je dévorais à ton âge, quand je voulais me faire une place à Paris. Je peux t'aider.' Qu'en dis-tu?\n\n(1) Tu acceptes de l'aide de ce petit homme.\n\n(2) Tu refuses, trop fier pour accepter de l'aide de plus petit que toi.");
		DecisionNode m55 = new DecisionNode("Maxime te fais venir chez lui, il possède un immeuble au cœur de Paris. Il te livre un étrange discours qui marqueras un changement drastique dans ta vie. 'Je t'aime bien le jeune, tu ne manques pas d'audace. Bien que je n'ai que 50 ans, ma vie touche à sa fin. J'aimerais te tester et voir si tu mérites que je te lègue une relique puissante que j'ai à ma disposition: on l'appelle la Peau de Chagrin. Elle a le pouvoir de réaliser tes souhaits les plus fous. Même si tu la gagnes, tu pourras choisir ou non de l'utiliser'. Pour gagner ce jeu, tu dois réussir à acquérir ce bien. 'Voilà  mon épreuve:\nPour la classe C définie comme suit:\nclass C {\n public static int i;\n public int j;\n public C() {i++; j=i; }\n}\nqu’affichera le code suivant?\nC x=new C();\nC y=new C();\nC z= x;\nSystem.out.println(z.i + ” et ” + z.j);\n\n(1) 2 et 2\n\n(2) 1 et 1\n\n(3) 2 et 1\n\n(4) 1 et 3\n\n");
		TerminalNode m56 = new TerminalNode("Tant pis pour toi, tu aurais dû saisir cette chance. Tu continueras à chercher la réussite à Paris sans la trouver, avant de rentrer bredouille chez toi.\nGAME OVER\n");
		TerminalNode m57 = new TerminalNode("Bravo, tu possèdes des connaissances du futur, ou alors tu as eu de la chance. James Gosling te remets la Peau de Chagrin, qui exhauce tout tes desirs. Bravo jeune voyou! A toi la gloire et laa notoriete, tu vas pouvoir te concentrer et faire du bien!\n");
		TerminalNode m58 = new TerminalNode("C'est raté, tu n'as pas ce qu'il faut pour mériter cette peau. Tu pars de chez James Gosling que tu ne reverras jamais.\nGAME OVER\n");
		
		TerminalNode mortclown = new TerminalNode("Il accepte, mais tu n'as aucun objet special. Il commence a pleurer, triste que tu lui ait menti. Et Il pleure de plus en plus fort, tu commences a avoir tres mal a la tete, et plus il pleure fort, plus tu as mal a la tete, jusqu'a tomber dans l'inconsciene.\nGAME OVER.");
		TerminalNode t = new TerminalNode("Fin de la partie.");
		TerminalNode mort = new TerminalNode("Mort au combat, une fin que tu aurais pu eviter. Quand tu pars au combat, essaye d'avoir une arme adapte au lieu et plus puissante que celle de ton adversaire.\nGAME OVER\n\n");
		TerminalNode sanssous = new TerminalNode("Un ganster sans le sou? On aura tout vu.\nEssaye de mieux gerer tes depense la prochaine fois\nGAME OVER");
		TerminalNode immoral = new TerminalNode("Rappelle toi, tu n'es pas comme les autres. Trop d'actions immorales ont pese sur ta conscience et ronge par la culpabilite, tu te suicides.\nGAME OVER");
		
		ImageNode auxerre = new ImageNode(m1, System.getProperty("user.dir")+File.separator+"Image"+File.separator+"Image1.jpeg");
		ImageNode paris = new ImageNode(m36, System.getProperty("user.dir")+File.separator+"Image"+File.separator+"Image2.jpeg");
		SoundNode son1 = new SoundNode(auxerre, System.getProperty("user.dir")+File.separator+"Son"+File.separator+"Son1.wav");
		
		
		Node.premier = intro;
		
		//On definit les choix qui suivent les Nodes
		
		List<Event> N0 = new ArrayList<Event>(Arrays.asList(son1,t));
		List<Event> N1 = new ArrayList<Event>(Arrays.asList(m2,m3,m4));
		List<Event> N2 = new ArrayList<Event>(Arrays.asList(m5));
		List<Event> N3 = new ArrayList<Event>(Arrays.asList(m5));
		List<Event> N4 = new ArrayList<Event>(Arrays.asList(m5));
		List<Event> N5 = new ArrayList<Event>(Arrays.asList(m6,m7,m8));
		List<Event> N6 = new ArrayList<Event>(Arrays.asList(m9));
		List<Event> N7 = new ArrayList<Event>(Arrays.asList(m9));
		List<Event> N8 = new ArrayList<Event>(Arrays.asList(m9));
		List<Event> N9 = new ArrayList<Event>(Arrays.asList(m10,m11,m12,m13));
		List<Event> N10 = new ArrayList<Event>(Arrays.asList(m14));
		List<Event> N11 = new ArrayList<Event>(Arrays.asList(m14));
		List<Event> N12 = new ArrayList<Event>(Arrays.asList(m14));
		List<Event> N13 = new ArrayList<Event>(Arrays.asList(m14));
		List<Event> N14 = new ArrayList<Event>(Arrays.asList(m15,m29));
		List<Event> N15 = new ArrayList<Event>(Arrays.asList(m16,m17,m18));
		List<Event> N16 = new ArrayList<Event>(Arrays.asList(m19,m20));
		List<Event> N17 = new ArrayList<Event>(Arrays.asList(m21,m22));
		List<Event> N18 = new ArrayList<Event>(Arrays.asList(m23,m24));
		List<Event> N19 = new ArrayList<Event>(Arrays.asList(m25));
		List<Event> N21 = new ArrayList<Event>(Arrays.asList(m25));
		List<Event> N23 = new ArrayList<Event>(Arrays.asList(m25));
		List<Event> N25 = new ArrayList<Event>(Arrays.asList(m26,m27,m28));
		List<Event> N26 = new ArrayList<Event>(Arrays.asList(paris));
		List<Event> N27 = new ArrayList<Event>(Arrays.asList(paris));
		List<Event> N29 = new ArrayList<Event>(Arrays.asList(m30,m31));
		List<Event> N30 = new ArrayList<Event>(Arrays.asList(m32,m33));
		List<Event> N31 = new ArrayList<Event>(Arrays.asList(m34,m35));
		List<Event> N32 = new ArrayList<Event>(Arrays.asList(paris));
		List<Event> N34 = new ArrayList<Event>(Arrays.asList(paris));
		List<Event> N36 = new ArrayList<Event>(Arrays.asList(m37,m38,m39));
		List<Event> N37 = new ArrayList<Event>(Arrays.asList(m40));
		List<Event> N38 = new ArrayList<Event>(Arrays.asList(m40));
		List<Event> N40 = new ArrayList<Event>(Arrays.asList(m41,m42));
		List<Event> N41 = new ArrayList<Event>(Arrays.asList(m54));
		List<Event> N42 = new ArrayList<Event>(Arrays.asList(m43,m44));
		List<Event> N43 = new ArrayList<Event>(Arrays.asList(m47));
		List<Event> N44 = new ArrayList<Event>(Arrays.asList(m45,m46));
		List<Event> N45 = new ArrayList<Event>(Arrays.asList(m47));
		List<Event> N47 = new ArrayList<Event>(Arrays.asList(m48,m49,m50,m51));
		List<Event> N48 = new ArrayList<Event>(Arrays.asList(m54));
		List<Event> N49 = new ArrayList<Event>(Arrays.asList(m52,m53));
		List<Event> N50 = new ArrayList<Event>(Arrays.asList(m54,mortclown));
		List<Event> N52 = new ArrayList<Event>(Arrays.asList(m54));
		List<Event> N54 = new ArrayList<Event>(Arrays.asList(m55,m56));
		List<Event> N55 = new ArrayList<Event>(Arrays.asList(m58,m58,m57,m58));

		intro.setNodes(N0);
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
		m36.setNodes(N36);
		m37.setNodes(N37);
		m38.setNodes(N38);
		m40.setNodes(N40);
		m41.setNodes(N41);
		m42.setNodes(N42);
		m43.setNodes(N43);
		m44.setNodes(N44);
		m45.setNodes(N45);
		m47.setNodes(N47);
		m48.setNodes(N48);
		m49.setNodes(N49);
		m50.setNodes(N50);
		m52.setNodes(N52);
		m54.setNodes(N54);
		m55.setNodes(N55);
		
		//On ajout scanner aux nodes

		DecisionNode.s = scanner;
	
		
// ------ UNIVERS ----------------------------------------------------------------------------------------------------------------------------------------------------------------

		
		//On definit les personnages
		
		Perso chantal = new Perso("Chantal", 1500, "Mais regardez moi ca, un petit bandit qui cherches a se faire un nom. Tu penses vraiment avoir la taille pour conquerir ce monde? En tout cas, heureuse de faire partie de ton équipe, jeune brigand",new Weaponl("Pistolet"));
		Perso apagnan = new Perso("Dominique Apagnan", 2, "Hahahahaha rejoins moi pour conquerir le MONDE!", new Weapons("Poings"));
		Perso boss_lfg = new Perso("Monsieur Gilbert", 2000, "Etant oriente objet, je cherche a collectionner les artefacts les plus rares de France.", new Weapons("Poings"));
		Perso crampte = new Perso("Eric Crampte", 3000, "Peuh, que des minables", new Weaponl("Couteau_de_Lancer"));
		Perso garde = new Perso("Garde", 100, "Tu vas voir si je suis pas un garde", new Weapons("Epee"));
		
		//On definit les gangs
		
		Gang lfg = new Gang("Les freres Gilbert", 2000, "Bien le bonsoir petit voyou. Oses-tu seulement rejoindre notre groupe?",boss_lfg,new Weapons("Poings"));
		
		Node.mapAllie.put(Integer.valueOf(1),chantal);
		Node.mapAllie.put(Integer.valueOf(2),lfg);
		Node.mapAllie.put(Integer.valueOf(3),apagnan);
		
		Node.mapOpp.put(Integer.valueOf(1), crampte);
		Node.mapOpp.put(Integer.valueOf(2), garde);

		
		Weapon wpa = new Weapons("Poing_Americain");
		Weapon wpo = new Weapons("Poignard");
		Weapon wma = new Weapons("Machette");
		Weapon wep = new Weapons("Epee");
		Weapon wco = new Weaponl("Couteau_de_Lancer");
		Weapon wsa = new Weaponl("Sarbacane");
		Weapon wpi = new Weaponl("Pistolet");
		Weapon wca = new Weaponl("Carabine");

		Node.mapW.put(Integer.valueOf(1), wp);
		Node.mapW.put(Integer.valueOf(2), wpa);
		Node.mapW.put(Integer.valueOf(3), wpo);
		Node.mapW.put(Integer.valueOf(4), wma);
		Node.mapW.put(Integer.valueOf(5), wep);
		Node.mapW.put(Integer.valueOf(6), wco);
		Node.mapW.put(Integer.valueOf(7), wsa);
		Node.mapW.put(Integer.valueOf(8), wpi);
		Node.mapW.put(Integer.valueOf(9), wca);
		
		Event currentNode = intro;


		
		while (!(currentNode instanceof TerminalNode) && (princ.vivant) && (princ.getCash() > 0) && (princ.getMoralpt() > 0)) {
			currentNode.display();
			currentNode = currentNode.choosenext();
		}
		if (!princ.vivant) {
			currentNode = mort;
		}
		if (princ.getCash() <= 0) {
			currentNode = sanssous;
		}
		if (princ.getMoralpt() <= 0) {
			currentNode = immoral;
		}
		currentNode.display();
		scanner.close();
		
	}
}
