package _Project_Calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println(" ");
		System.out.println("                Calculator");
		System.out.println(" ");
		Scanner ss=new Scanner(System.in);
		System.out.println("    1 - Addition           2 - Subtraction");
		System.out.println(" ");
	    System.out.println("    3 - Multiplication     4 - Division");
	    System.out.println(" ");
	    System.out.println(" ");
		int val1=ss.nextInt();
		System.out.print(" ");
		int val2=ss.nextInt();
		int op=ss.nextInt();
		
		
		switch(op) {
              
		case 1:
			System.out.println(val1+val2);
			break;
			
		case 2:
			System.out.println(val1-val2);
			break;
			
		case 3:
			System.out.println(val1*val2);
			break;
			
		case 4:
			System.out.println(val1/val2);
			break;
			
		
		}
		
		System.out.println("EXIT");
	}
	
	

	    
	}


