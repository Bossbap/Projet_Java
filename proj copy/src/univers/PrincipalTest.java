package univers;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrincipalTest {
	private Principal princ;

	@BeforeEach
	public void setup() {
		this.princ = new Principal("Test",new Weapons(""));
	}
	
	@Test
	public void varw_changeWeapon_Poignard() {
		Weapon w = new Weaponl("Carabine");
		princ.varw(w);
		assertEquals(princ.getWeapon().getOrder(),3);
	}
	
	@Test
	public void varc_changeCash_200() {
		princ.varc(100);
		assertEquals(princ.getCash(),200);
	}
	
	@Test
	public void varmp_changeMoralpt_0() {
		princ.varmp(-5);
		assertEquals(princ.getMoralpt(),0);
	}
	
	@Test
	public void addAllie_changeAllie_c() {
		Groupe c = new Perso("Test",0,"IntroTest",new Weapons(""));
		princ.addAllie(c);
		assertEquals(princ.getAllie(),c);
	}
	
}


/*public class DecisionNodeTest {
	private DecisionNode ntest;
	private Scanner scanner;
	private DecisionNode d1;
	private DecisionNode d2;
	private DecisionNode d3;
	private DecisionNode d4;
	
	@BeforeEach
	public void init() {
		ntest = new DecisionNode("test");
		scanner = new Scanner(System.in);
		DecisionNode.s = scanner;
		Principal princ = new Principal("test", new Weapons(""));
		Node.p = princ;
	}
	
	@AfterEach
	public void end() {
		scanner.close();
	}
	
	@Test
	public void choosenext_listofnodes_t1() {
		d1 = new DecisionNode("1");
		d2 = new DecisionNode("2");
		d3 = new DecisionNode("3");
		d4 = new DecisionNode("4");
		List<Event> Nist = new ArrayList<Event>(Arrays.asList(d1,d2,d3,d4));
		ntest.setNodes(Nist);
		System.out.println("Choisir un numero qui n'est pas entre 1 et 4 pour voir si la selection d'un non choix fonctionne, puis 4");
		Event res = ntest.choosenext();
		assertEquals(d4,res);
	}
*/	
