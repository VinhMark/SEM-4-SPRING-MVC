package demo;

import org.springframework.context.*;
import org.springframework.context.support.*;
import entities.*;


public class Demo1 {

	public static void main(String[] args) {
		try {
			
			ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src\\applicationContext.xml");
			Student student1 = (Student) applicationContext.getBean("student1");
			
			Student student2 = (Student) applicationContext.getBean("student2");
			
			System.err.println("Insert using set()");
			System.out.println(student1.getId());
			System.out.println(student1.getName());
			System.out.println(student1.getAvg());
			System.out.println("Ma khoa :" +student1.getFaculty().getId());
			System.out.println("Ma khoa :" +student1.getFaculty().getName());
			System.out.println("Gioi tinh :" +student1.getGender());
			System.out.println("Tuoi :" +student1.getAge());
			System.out.println("Cources:");
			for (String cources : student1.getCources()) {
				System.out.println("\t"+cources);
			}
			
			
			System.out.println("----------------------");
			System.err.println("Insert using contructor");
			System.out.println(student2.getId());
			System.out.println(student2.getName());
			System.out.println(student2.getAvg());
			System.out.println("Ma khoa :" +student2.getFaculty().getId());
			System.out.println("Ma khoa :" +student2.getFaculty().getName());
			System.out.println("Gioi tinh :" +student2.getGender());
			System.out.println("Cources:");
			for (String cources : student1.getCources()) {
				System.out.println("\t"+cources);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
