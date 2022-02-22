package oop;

public class Employee extends Person{
  int emp_id;
  private double emp_salary;
  
  
  Employee()
  {
	  
  }
  
  
  public double getEmp_salary() {
	return emp_salary;
}


public void setEmp_salary(double emp_salary) {
	this.emp_salary = emp_salary;
}


Employee(int id, String name,int age, char gender,double salary,boolean pimpact)
  {
	 
	 super(name,age,gender,pimpact);
	 emp_id=id;
	 emp_salary=salary;
  }
  


public void display()
{
	//System.out.println(ORGINIZATION);
	System.out.println("-------------");
	System.out.println("Id : "+this.emp_id);
	super.display();
	System.out.println("Salary : "+this.emp_salary);
	System.out.println();
	Impact();
	
}



public double calculate(int bonus) {
	double  netsalary= bonus+ this.emp_salary;
	return netsalary;
}

public int compute(int num1, int num2)
{
	int time= num2-num1;
	return time;
}


void calculate(double n1, double n2)
{
	System.out.println(n1+n2);
}
  
}
