package exercises;

import java.util.Scanner;


public class Homework {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		System.out.println("Hello ");
		System.out.println("What is your name ");
		String text = s.nextLine();

		System.out.println("Hello " + text);

		int n1,n2,n3,n4,n5,n6,n7,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Now enter any number you want and press 0 if you want to stop");
		
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		n6=sc.nextInt();
		n7=sc.nextInt();

		
		if (n1 == 0){
			System.out.println("The end");
		}else {
			System.out.println("Ok, enetr another number");
		}
		
		sum=n1+n2+n3+n4+n5+n6+n7;
		System.out.println("The sum of those numbers is equal to " + sum);


	}

}
