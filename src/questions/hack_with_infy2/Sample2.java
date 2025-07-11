package questions.hack_with_infy2;

import java.util.*;

public class Sample2 {

    // Function to check if heroes can win starting from index `start`
    static boolean canHeroesWin(int[] villains, int start, int m, int h) {
        int heroIndex = 0;
        int heroHealth = h;

        for (int i = start; i < villains.length; i++) {
            int villainHealth = villains[i];

            if (heroHealth > villainHealth) {
                heroHealth -= villainHealth;
            } else if (heroHealth == villainHealth) {
                heroIndex++;
                if (heroIndex == m) {
                    if (i == villains.length - 1) return true;
                    return false;
                }
                heroHealth = h;
            } else {
                heroIndex++;
                if (heroIndex == m) return false;
                heroHealth = h;
                i--; // This villain still remains since hero lost
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format
        int n = sc.nextInt(); // Number of villains
        int m = sc.nextInt(); // Number of heroes
        int h = sc.nextInt(); // Health of each hero

        int[] villains = new int[n];
        for (int i = 0; i < n; i++) {
            villains[i] = sc.nextInt();
        }

        // Binary search on minimum number of villains to remove from front
        int low = 0, high = n, answer = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canHeroesWin(villains, mid, m, h)) {
                answer = mid;
                high = mid - 1; // try to remove fewer
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
