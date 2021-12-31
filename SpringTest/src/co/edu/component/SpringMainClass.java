package co.edu.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("co.edu.component");
		context.refresh();
		MathComponent ms = context.getBean(MathComponent.class);
		int result = ms.add(1, 2);
		System.out.println("Addition of 1 and 2 = " + result);
		context.close();
		
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
		context2.scan("co.edu.component");
		context2.refresh();
		System.out.println("Refreshing the spring context");
		DBConnection dbConnection = context2.getBean(DBConnection.class);
		dbConnection.printDBConfigs();
		context2.close();
	}
}
