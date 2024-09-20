import java.util.Scanner;
public class Main {

	private static final int John = 0;
	
	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What;s your full name?");
		String name = in.nextLine();
		
		int num1 = in.nextInt();
		in.nextLine();
		
        String product = "Pizza";
		System.out.println("Who is your Celebrity Crush?");
		String Celebcrush = in.nextLine();
		System.out.println("What is the last Pizza you would eat?");
		String pizza = in.nextLine();
		System.out.println("Would you put any toppings on it?");
		String tops = in.nextLine();
		System.out.println("How many Toppings?");
	    String toppings = in.nextLine();
	    System.out.println("Who is your Best friend?");
		String bestie = in.nextLine();
		System.out.println("If you could travel around the world, where would it be?");
		String travel = in.nextLine();
		System.out.println ("Would you Visit Miami or Hawaii");
		String visit = in.nextLine();
		System.out.println ("Pick a whole number between 30 and 60");
		String whole = in.nextLine();
		System.out.println("Pick a decimal number between 0.25 and 0.50");
		double decNumber = in.nextDouble();
		in.nextLine();
		System.out.println("Pick a random Social media platform");
		String media = in.nextLine();
		System.out.println("How old is your Best friend");
		String age = in.nextLine();
		System.out.println("How old is your Celebrity Crush");
		String age2 = in.nextLine();
		
	
		
		
		//Story time!
		
		System.out.println ("One day i woke up and decided to go the my Kitchen and make some "+pizza+" with "+tops+" on my pizza and i added "+toppings+" on it."
		+ "I decided to call my best friend "+bestie+" on "+media+" and asked if he wanted to travel to "+travel+"
		+ "He agreed and we ended up going to "+travel+" Once we got there my bestfriend saw "+Celebcrush+" They asked them if they wanted to go on to which they said yes."
		+ "But They wanted to kno wmy best friends age."+"My Bestfriend was "+age+" and the celebcrush was "+age2+" So "+Celebcrush+" started running"
		+ "all the way to"+visit+" Because they were not tryna go to jail." But it took us "+whole+" and "+decNumber+" to get to them and we ended up calling the police"
		+ "just in time and they ended up putting them behind in bars for life");

	}

}
