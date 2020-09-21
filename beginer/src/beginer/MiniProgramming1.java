package beginer;

import java.util.Scanner;

public class MiniProgramming1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		System.out.println("Hello ");
		System.out.println("What is your name ");
		String text = s.nextLine();

		System.out.println("Hello " + text);


		int x = 1,x1 = 1,x2 = 1,sum = 0;
	
		System.out.println("Ok so now enter two numbers ");


		while(x !=0) {
			x=Integer.parseInt(s.nextLine());
			x1=Integer.parseInt(s.nextLine());
			x2=Integer.parseInt(s.nextLine());
			
			sum=sum + x + x1 + x2;
			System.out.println("The sum of two numbers " + sum);
		}		
		System.out.println("The End");	

	}

}
