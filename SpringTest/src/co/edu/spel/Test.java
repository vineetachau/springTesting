package co.edu.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  

		Expression exp = parser.parseExpression("'Hello SPEL'");  
		String message = (String) exp.getValue();  
		System.out.println(message);

		parser = new SpelExpressionParser();  
		exp = parser.parseExpression("'Welcome SPEL'.concat('!')");  
		String message2 = (String) exp.getValue();  
		System.out.println(message2); 

		exp = parser.parseExpression("'Hello World'.bytes");  
		byte[] bytes = (byte[]) exp.getValue();  
		for(int i=0;i<bytes.length;i++){  
			System.out.print(bytes[i]+" ");  
		}  
	}  
}
