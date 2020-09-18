import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args) {
		String moreMovies = "y";
      	Scanner in = new Scanner(System.in);
		while (moreMovies.equals("y")) {
          System.out.println("Enter the name of a movie");
          String answer1 = in.nextLine();
          System.out.println("Enter the rating of the movie");
          String answer2 = in.nextLine();
          System.out.println("Enter the number of the tickets sold for this movie");
          String answer3 = in.nextLine();
          System.out.println("Do you want to enter another? (y or n)");
          moreMovies = in.nextLine();
        }
        System.out.println("Goodbye");
	}
}
