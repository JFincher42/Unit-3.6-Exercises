import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = console.nextInt();
		
		System.out.print("Enter a code (n/p): ");
		String code = console.next();
		
		while (code.equals("n") || code.equals("p")) {
			if (code.equals("n")) num++;
			else                  num--;
			System.out.println("num = " + num);
			System.out.print("Enter a code (n/p): ");
			code = console.next();
		}
	}

}
