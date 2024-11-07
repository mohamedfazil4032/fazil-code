package in.sp.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.Student;

public class Execution {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/sp/resource/applicationContext.xml");
		
		Student s = (Student) context.getBean("stdId");
		
		s.display();
	}

}
