package representation;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class DecisionNodeTest {
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
		Node[] Nist = {d1,d2,d3,d4};
		ntest.setNodes(Nist);
		System.out.println("Choisir un numero qui n'est pas entre 1 et 4 pour voir si la selection d'un non choix fonctionne, puis 4");
		assertEquals(d4,ntest.choosenext());
	}
	
}
