package AreaOfDiffShapes;

import java.util.Scanner;

public class Triangle extends Shapes {
	
        public void area(){
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Base :");
        	int base = sc.nextInt();
        	System.out.println("Enter height :");
        	int height = sc.nextInt();
        	double A = (base*height)/2;
        	System.out.println("Area of Triangle: "+A);
		
	}
        
	

}
