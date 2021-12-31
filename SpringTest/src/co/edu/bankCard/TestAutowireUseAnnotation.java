package co.edu.bankCard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireUseAnnotation {

	public static void main(String[] args) {
     ApplicationContext springAppCtx = new ClassPathXmlApplicationContext("AutowireByAnnotationBeanSettings.xml");
     BankCardController bcController = (BankCardController)springAppCtx.getBean("bcController");
     bcController.createBankCard("Bank Of China", "BOC888888", "2017/08/08");
 }
}
