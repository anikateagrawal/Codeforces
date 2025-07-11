package questions.hack_with_infy2;

import java.util.*;

public class Easy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read energy E
        int E = sc.nextInt();

        // Read number of exercises N
        int N = sc.nextInt();

        // Read energy drain for each exercise
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Call and print result
        int result = minExercisesToGetTired(E, A);
        System.out.println(result);
    }

    public static int minExercisesToGetTired(int E, int[] A) {
        List<Integer> allUses = new ArrayList<>();

        // Each exercise can be used at most 2 times
        for (int energy : A) {
            allUses.add(energy); // First use
            allUses.add(energy); // Second use
        }

        // Sort in descending order to use max energy drain first
        allUses.sort(Collections.reverseOrder());

        int count = 0;
        for (int drain : allUses) {
            E -= drain;
            count++;
            if (E <= 0) {
                return count;
            }
        }

        // If energy never went to 0 or below
        return -1;
    }
}
