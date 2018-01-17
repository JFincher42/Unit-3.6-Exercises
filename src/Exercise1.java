import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int total = 0;
		System.out.print("Enter an integer, negative to stop: ");
		int num = console.nextInt();
		while (num>=0) {
			total += num;
			System.out.print("Enter an integer, negative to stop: ");
			num = console.nextInt();
		}
		System.out.println("Total = " + total);
	}

}
