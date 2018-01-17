import java.util.Scanner;

public class StopToEnd {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter something, STOP to end: ");
		String word = console.nextLine();
		while (!word.equals("STOP")) {
			System.out.print("Try again: ");
			word = console.nextLine();
		}
		console.close();
	}

}
