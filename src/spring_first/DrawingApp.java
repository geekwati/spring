package spring_first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String...strings) {
//		Triangle triangle = new Triangle();
//		triangle.draw();
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src\\spring.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle"); 
		triangle.draw();
	}
	
}
