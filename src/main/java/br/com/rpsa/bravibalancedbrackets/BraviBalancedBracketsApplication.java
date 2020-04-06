package br.com.rpsa.bravibalancedbrackets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class BraviBalancedBracketsApplication {

	public boolean isBalanced(String str) {
		if (null == str || ((str.length() % 2) != 0)) {
			return false;
		} else {
			char[] charArray = str.toCharArray();
			for (char c : charArray) {
				if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
					return false;
				}

			}
		}

		while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
			str = str.replaceAll("\\(\\)", "")
					.replaceAll("\\[\\]", "")
					.replaceAll("\\{\\}", "");
		}
		return (str.length() == 0);

	}

}
