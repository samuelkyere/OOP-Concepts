package oop;

public class Person1 extends Person {
  private int per_id;
  private String title;
  
  Person1(int id,String name, int age, char gender,String title, boolean impact){
	  super(name,age,gender,impact);
	  
  }

public int getPer_id() {
	return per_id;
}

public void setPer_id(int per_id) {
	this.per_id = per_id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}
  public void display() {
	  System.out.println("Id: "+this.getPer_id());
	  System.out.println("Nmae: "+this.getTitle());
	 super.display();
  }
}
