import java.util.Scanner;

public class MaxScore {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a score, -1 if done: ");
		int score = console.nextInt();		// Get the next integer
		int max = score;					// Our current highest score
		int sum = 0;						// The sum of all scores
		int count = 0;						// How many scores do we have
		while (score != -1) {				// While the user is entering valid scores
			sum += score;					// Keep a running sum
			count++;						// Increment the count
			if (score>max) {				// Is the new score greater than the current max?
				max = score;				// We have a new maximum
			}
			System.out.print("Enter a score, -1 if done: ");
			score = console.nextInt();
		}
		
		// Print results
		System.out.println("The maximum score was " + max);
		System.out.println("The average was " + sum/count);
	}
	
}
