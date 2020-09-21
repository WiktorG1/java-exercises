package exercises;

import java.util.Scanner;

public class ComputerScience {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the width");
		String text = s.nextLine();
		Integer width = Integer.parseInt(text);
		
		System.out.println("Enter the height");
		String text2 = s.nextLine();
		Integer height = Integer.parseInt(text2);
		
		Integer area = width * height;
		Integer perimeter = 2 * (width + height);
		
		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);		

	}

}
