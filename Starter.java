package oop;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp = new Employee(3,"Kojo",32,'M',85000.00,true);
		Student st1 = new Student(7,"Ama",26,'F',90.0,95.0, 80.0 ,false);
//		int id, String name,int age, char gender,double salary,boolean pimpact)
		Person1 per = new Person1(25,"Kwaku",26,'M',"Dr.",true);
		per.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an employee info: ");
		int id = sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		double salary = sc.nextDouble();
		boolean pimpact = sc.nextBoolean();
		 Employee emp = new Employee (id, name, age, gender, salary,pimpact);
		 emp.display();
		 
		 
		
		
		
			
		
		
	  
	}

}
