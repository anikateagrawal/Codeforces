package questions.hack_with_infy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Medium7 {

    static int[] parent;
    static int[] size;
    static int[] beauty;
    static List<Integer>[] members;
    static int n;

    // Find operation with path compression
    public static int findSet(int v) {
        if (v == parent[v]) {
            return v;
        }
        return parent[v] = findSet(parent[v]);
    }

    // Unite operation with union-by-size
    public static void uniteSets(int a, int b) {
        int rootA = findSet(a);
        int rootB = findSet(b);

        if (rootA != rootB) {
            // Union-by-size: merge smaller component into larger one
            if (size[rootA] < size[rootB]) {
                int temp = rootA;
                rootA = rootB;
                rootB = temp;
            }

            // New beauty = sum of old beauties - reduction from new connections
            int reduction = 0;
            // Iterate through the smaller component to find new adjacencies
            for (int node : members[rootB]) {
                // Check for adjacency with the larger component
                if (node > 1 && findSet(node - 1) == rootA) {
                    reduction++;
                }
                if (node < n && findSet(node + 1) == rootA) {
                    reduction++;
                }
            }

            // Update beauty of the new root
            beauty[rootA] += beauty[rootB] - reduction;

            // Perform the merge
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
            members[rootA].addAll(members[rootB]);
            members[rootB].clear(); // Free up memory
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading input according to the unusual sample format
        String nStr = br.readLine();
        if (nStr == null || nStr.isEmpty()) return;

        n = Integer.parseInt(nStr);
        int q = Integer.parseInt(br.readLine());
        br.readLine(); // Skip the third unused number

        parent = new int[n + 1];
        size = new int[n + 1];
        beauty = new int[n + 1];
        members = new ArrayList[n + 1];

        // Initialization
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
            beauty[i] = 1;
            members[i] = new ArrayList<>();
            members[i].add(i);
        }

        long totalAnswer = 0;

        for (int k = 0; k < q; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                uniteSets(u, v);
            } else { // type == 2
                int u = Integer.parseInt(st.nextToken());
                int root = findSet(u);
                totalAnswer += beauty[root];
            }
        }

        System.out.println(totalAnswer);
    }
}