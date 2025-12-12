package com.in.obj;

public class Student2 {
	
	    String name;
	    int marks;

	    Student2(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	        System.out.println(name +"::"+marks);
	    }
        Student2 addBonus() {
        	
        	return new Student2(name, marks+5);
        }
	  
	    
	  public static void main(String[] args) {
		Student2 s2 = new Student2("Sunny", 80);
		s2.addBonus();
	}  
	}

	


