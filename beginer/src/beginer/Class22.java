package beginer; 

import java.util.Scanner;

public class Class22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		String text = s.nextLine();
		Integer value = Integer.parseInt(text);
		
		for (Integer n = 1; n <= 20; n += 1)
			System.out.println("" + n + " * " + value + " = " + (n * value));
		
	}

}
