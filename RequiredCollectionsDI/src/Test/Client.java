package Test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Demo;


public class Client {
	   public static void main(String arg[]){
		    ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		    Demo c  = (Demo)ap.getBean("d");
			c.printData();
} 
}