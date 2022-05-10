import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		Scanner userStringInput = new Scanner (System.in);		
		System.out.println("What is your name?");		
		String name = userStringInput.nextLine();		
		System.out.println("Hello, " + name + "!");
		
		if (name.equals("Sara")) {
			System.out.println("It's you!");
		}
		
		else {
			System.out.println("Go somewhere else!");
		}
		
		Scanner userIntInput = new Scanner (System.in);		
		System.out.println("How old are you?");
		int age = userIntInput.nextInt();
		
		
		if(age == 17) {
			System.out.println("Almost an adult!");
		}

	}

}
