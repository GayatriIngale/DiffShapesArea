package AreaOfDiffShapes;

import java.util.Scanner;

public class Shapes {
	
	
	
	  public void area() {
	  
	  }
	 
	public static void main(String args[]) {
		Shapes t = new Triangle();
		Shapes c = new Circle();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise");
		System.out.println("Enter 1 for tringle");
		System.out.println("Enter 2 for cilcle");
		
		int choise = sc.nextInt();
		switch(choise){    
		case 1:    
			t.area();
			break;  
		 
		case 2:  
			c.area();
			break;
			
		default: 
			System.out.println("incorrect choice");
		}
	}

}
