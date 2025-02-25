package Task2;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String title,rating;
		int ticketsold;
		System.out.println("Enter the name of a movie");
		title = input.nextLine();
		System.out.println("Enter the rating of the movie");
		rating= input.nextLine();
		System.out.println("Enter the number of tickets sold for this movie");
		ticketsold = input.nextInt();
		Movie movie1 = new Movie(title,rating,ticketsold);
		System.out.println(movie1.toString());
		System.out.println("Goodbye\n\n");
		input.close();
	}

}
