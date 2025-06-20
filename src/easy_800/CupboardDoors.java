package easy_800;

import java.util.Scanner;

public class CupboardDoors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // number of cupboards

        int leftOpen = 0;   // count of left doors that are open
        int rightOpen = 0;  // count of right doors that are open

        // Read each cupboard's door states
        for (int i = 0; i < n; i++) {
            int left = scanner.nextInt();   // 0 = closed, 1 = open
            int right = scanner.nextInt();  // 0 = closed, 1 = open

            if (left == 1) leftOpen++;
            if (right == 1) rightOpen++;
        }

        // Minimum changes needed for left doors = min(open count, closed count)
        int leftChanges = Math.min(leftOpen, n - leftOpen);

        // Minimum changes needed for right doors = min(open count, closed count)
        int rightChanges = Math.min(rightOpen, n - rightOpen);

        // Total time in seconds
        int totalTime = leftChanges + rightChanges;

        System.out.println(totalTime);
    }
}
