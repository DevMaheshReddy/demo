package com.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main( String[] args ){
    @SuppressWarnings("resource")
	ClassPathXmlApplicationContext context = 
    new ClassPathXmlApplicationContext("config.xml");
   Student student = context.getBean("student",Student.class);
      System.out.println(student);
    }
}
