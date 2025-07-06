package questions.hack_with_infy;

import java.util.*;

public class Hard11 {
    static int[] p;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int low = 0, high = n, answer = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isValid(mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }

    // Check if with distance k, we can get a path of length >= m
    private static boolean isValid(int k) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Build the graph
        for (int i = 0; i < n; i++) {
            for (int j = Math.max(0, i - k); j <= Math.min(n - 1, i + k); j++) {
                if (i != j && p[i] < p[j]) {
                    graph.get(i).add(j);
                }
            }
        }

        // Find longest path using DFS + memo
        int[] dp = new int[n];
        boolean[] visited = new boolean[n];
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, dfs(i, graph, dp, visited));
            if (maxLen >= m) return true;
        }

        return false;
    }

    private static int dfs(int node, List<List<Integer>> graph, int[] dp, boolean[] visited) {
        if (visited[node]) return dp[node];
        visited[node] = true;

        int maxPath = 1;
        for (int nei : graph.get(node)) {
            maxPath = Math.max(maxPath, 1 + dfs(nei, graph, dp, visited));
        }

        return dp[node] = maxPath;
    }
}
