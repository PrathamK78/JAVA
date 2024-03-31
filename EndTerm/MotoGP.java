package EndTerm;

import java.util.Arrays;
import java.util.Scanner;

public class MotoGP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of racers
        System.out.print("Enter the number of racers (N): ");
        int N = scanner.nextInt();

        // Read the skills of the racers
        System.out.println("Enter the skills of the racers:");
        int[] skills = new int[N];
        for (int i = 0; i < N; i++) {
            skills[i] = scanner.nextInt();
        }

        // Find the minimum difference in skills
        int minDifference = findMinimumDifference(skills);

        // Print the result
        System.out.println("Minimum difference in skills: " + minDifference);
    }

    // Function to find the minimum difference in skills
    private static int findMinimumDifference(int[] skills) {
        // Sort the skills array
        Arrays.sort(skills);

        // Initialize the minimum difference to a large value
        int minDifference = Integer.MAX_VALUE;

        // Iterate through the array and find the minimum difference
        for (int i = 1; i < skills.length; i++) {
            int currentDifference = skills[i] - skills[i - 1];
            minDifference = Math.min(minDifference, currentDifference);
        }

        return minDifference;
    }
}

