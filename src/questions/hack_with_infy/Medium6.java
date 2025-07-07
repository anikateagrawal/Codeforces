package questions.hack_with_infy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Medium6 {

    public static int calculateAbsentExpert(int[] skills) {
        Set<Integer> seenSkills = new HashSet<>();
        for (int skill : skills) {
            seenSkills.add(skill);
        }

        int expertValue = 0;
        while (seenSkills.contains(expertValue)) {
            expertValue++;
        }
        return expertValue;
    }

    public static int maxExpertNumber(int N, int[] A) {
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                int[] currentTeamSkills = new int[i - j];
                for (int k = 0; k < (i - j); k++) {
                    currentTeamSkills[k] = A[j + k];
                }

                int currentExpertValue = calculateAbsentExpert(currentTeamSkills);

                dp[i] = Math.max(dp[i], dp[j] + currentExpertValue);
            }
        }
        return dp[N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int result = maxExpertNumber(N, A);
        System.out.println(result);

        scanner.close();
    }
}