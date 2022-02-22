package oop;

public class Person {
   static int  count=0;
	
   String pname;
   int page;
   char pgender;
   boolean pimpact;
   
    
    
    public Person()
    {
    	//count++;
    	this("Peter",34,'M',true);
    }
    
    
    public Person(String name, int age, char gender, boolean impact)
    {
    	pname=name;
    	page=age;
    	pgender=gender;
    	count++;
    	pimpact = impact;
    }   
    
    public void Hello()
    {
    	System.out.println("Hello there!!");
    }
    
    
    public void display()
    {
    	System.out.println("Name : "+this.pname);
    	System.out.println("Gender : "+this.pgender);
    	System.out.println("Age : "+this.page);
    	Impact();   	
    }
    public void Impact()
    {
    	if (pimpact=true) {
    	System.out.println("Has an impact on humanity, he's a great person!");
    	}
    	else {
    		System.out.println("He's not a great person!");
    	}
    }
    
    
    
//   public void display(Person obj)
//    {
//  	System.out.println("within parameterized display...");
//  	System.out.println("Name : "+obj.pname);
//
//    }
    
   double calculate(int num)
    {
    	System.out.println("calculate inside parent class");
    	return 121.33;
    }
    
    public  static  void totalPerson()
    {
    	System.out.println("total person objects are:"+ count);
    }
    
    


}
