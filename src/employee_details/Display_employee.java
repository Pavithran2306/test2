package employee_details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Display_employee {

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp1 = context.getBean("emp", Employee.class);
			
				emp1.display();
		
		
	}

}
