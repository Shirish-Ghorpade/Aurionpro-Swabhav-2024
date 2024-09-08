

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurionpro.model.Computer;
import com.aurionpro.model.HardDisk;

public class ComputerTest {
	public static void main(String[] args) {
//		ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
//		HardDisk disk = (HardDisk) context.getBean("harddisk", "HardDisk.class");
//		System.out.println(disk);
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
		Computer disk = (Computer) context.getBean("computer", "Computer.class");
		System.out.println(disk);
	}
}
