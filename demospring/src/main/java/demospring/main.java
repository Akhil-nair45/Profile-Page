package demospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("demo.xml");
		person p1 =ac.getBean(person.class);
		p1.display();
		
		ApplicationContext ac1 = new AnnotationConfigApplicationContext(Team.class);
		Team t1 = ac1.getBean(Team.class);
		t1.show();
	}

}
