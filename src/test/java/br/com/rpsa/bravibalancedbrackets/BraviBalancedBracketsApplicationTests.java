package br.com.rpsa.bravibalancedbrackets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BraviBalancedBracketsApplicationTests {

	@Test
	void checkIfBracketsAreBalaced() {
		BraviBalancedBracketsApplication braviBalancedBrackets = new BraviBalancedBracketsApplication();

		Assertions.assertEquals(braviBalancedBrackets.isBalanced("(){}[]"), true);
		Assertions.assertEquals(braviBalancedBrackets.isBalanced("[{()}](){}"), true);
	}

	@Test
	void checkIfBracketsAreNotBalaced() {
		BraviBalancedBracketsApplication braviBalancedBrackets = new BraviBalancedBracketsApplication();

		Assertions.assertEquals(braviBalancedBrackets.isBalanced("[]{()"), false);
		Assertions.assertEquals(braviBalancedBrackets.isBalanced("[{)]"), false);
	}

}
