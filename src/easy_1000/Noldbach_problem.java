package easy_1000;

import java.util.*;

public class Noldbach_problem {
    static final int MAX = 1001;
    static boolean[] isPrime = new boolean[MAX];

    // Sieve of Eratosthenes
    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        sieve();

        // Collect all primes ≤ n
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }

        int count = 0;
        for (int i = 0; i < primes.size() - 1; i++) {
            int sum = primes.get(i) + primes.get(i + 1) + 1;
            if (sum <= n && isPrime[sum]) {
                count++;
            }
        }

        System.out.println(count >= k ? "YES" : "NO");
    }
}
