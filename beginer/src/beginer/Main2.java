package beginer;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("What is your name");

		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("What year were you born");
		String text = s.nextLine();
		Integer year = Integer.parseInt(text);
		Integer age = 2020 - year;
		
		System.out.println("Nice");
		System.out.println("You are " + age);
		
		
	}

}
