package representation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import univers.*;


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
		System.out.println("Choisir une chaine de caractere qui n'est pas un int ou numero qui n'est pas entre 1 et 4 pour voir si la selection d'un non choix fonctionne, puis 4");
		Event res = ntest.choosenext();
		assertEquals(d4,res);
	}
	
}
