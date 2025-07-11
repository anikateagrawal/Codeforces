package questions.hack_with_infy;

import java.util.*;

public class Medium8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();    // Number of chairs
        int X = sc.nextInt();    // Starting chair (1-indexed)
        int Y = sc.nextInt();    // Target chair (1-indexed)

        int[] A = new int[N];    // Jump values (0-indexed)
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Convert 1-indexed chairs to 0-indexed
        int start = X - 1;
        int target = Y - 1;

        int result = bfs(N, start, target, A);
        System.out.println(result);
    }

    static int bfs(int N, int start, int target, int[] A) {
        boolean[] visited = new boolean[N];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int chair = curr[0];
            int steps = curr[1];

            if (chair == target) return steps;

            int jump = A[chair];
            int right = (chair + jump) % N;
            int left = (chair - jump + N) % N;

            if (!visited[right]) {
                visited[right] = true;
                queue.add(new int[]{right, steps + 1});
            }
            if (!visited[left]) {
                visited[left] = true;
                queue.add(new int[]{left, steps + 1});
            }
        }
        return -1; // unreachable
    }
}
