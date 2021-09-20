package AreaOfDiffShapes;

import java.util.Scanner;

public class Circle extends Shapes {
	
       public void area() {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter radius");
    	   int r = sc.nextInt();
    	   double pi = 3.14;
    	   double A = (pi*Math.pow(r,2));
    	   System.out.println("Area of Circle: "+A);
		
	}

}
