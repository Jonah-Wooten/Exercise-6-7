import java.util.Scanner;

public class Exercise6 {

	private static final String input = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String cont = "y";

		do {
			System.out.println("Hello World");
			System.out.println("Would you like to continue? Y/N");
			String input = scan.nextLine();
		} while (cont.equalsIgnoreCase("y"));
		if (input.equalsIgnoreCase("n")) {
			System.out.println("Goodbye");
			System.out.println();
		}
	}

}
// scan.close();
