package co.edu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource); 
		Customer c = (Customer) factory.getBean("customerbean");
		c.displayInfo();

		Resource resource2=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory2=new XmlBeanFactory(resource2);  
		Question q=(Question)factory2.getBean("que");  
		q.displayInfo(); 
		
		Resource resource3=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory3=new XmlBeanFactory(resource3);  
	    Question2 q2=(Question2)factory3.getBean("que2");  
	    q2.displayInfo(); 
	    
	    Resource resource4=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory4=new XmlBeanFactory(resource4);  
	    Question q3=(Question)factory4.getBean("q3");  
	    q3.displayInfo(); 

	}

}
