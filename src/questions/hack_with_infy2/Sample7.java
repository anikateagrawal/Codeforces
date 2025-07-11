package questions.hack_with_infy2;

import java.util.*;

public class Sample7 {

    public static int maxDishesEaten(int[] arr) {
        // Frequency map: type -> count
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int type : arr) {
            freqMap.put(type, freqMap.getOrDefault(type, 0) + 1);
        }

        // Get all frequencies sorted (for greedy processing)
        List<Integer> freqs = new ArrayList<>(freqMap.values());
        Collections.sort(freqs);

        int maxDishes = 0;

        // Try starting count from 1 to max frequency
        for (int start = 1; start <= Collections.max(freqs); start++) {
            int count = start;
            int total = 0;

            // Copy of frequency list to simulate available dish types
            PriorityQueue<Integer> pq = new PriorityQueue<>(freqs);

            while (!pq.isEmpty()) {
                // Find the smallest type that can serve at least `count` dishes
                PriorityQueue<Integer> nextPQ = new PriorityQueue<>();
                boolean used = false;

                while (!pq.isEmpty()) {
                    int available = pq.poll();
                    if (!used && available >= count) {
                        total += count;
                        used = true;
                    } else {
                        nextPQ.add(available);
                    }
                }

                if (!used) break; // no type could serve this round
                count *= 2;
                pq = nextPQ;
            }

            maxDishes = Math.max(maxDishes, total);
        }

        return maxDishes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Arr = new int[N];
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println(maxDishesEaten(Arr));
    }
}
