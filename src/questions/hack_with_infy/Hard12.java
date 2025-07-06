package questions.hack_with_infy;

import java.util.*;

public class Hard12 {
    static int[] A, Bonus;
    static int[] segTree;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        A = new int[n];
        Bonus = new int[n];

        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        for (int i = 0; i < n; i++) Bonus[i] = sc.nextInt();

        buildSegmentTree();

        long xp = 0;
        for (int i = 0; i < n; i++) {
            int r = -1;
            for (int j = i + 1; j < n; j++) {
                if (A[j] % A[i] == 0) {
                    r = j;
                    break;
                }
            }

            if (r != -1) {
                int maxBonus = rangeMax(i, r);
                xp += maxBonus;
            }
        }

        System.out.println(xp);
    }

    // ------------------ Segment Tree for Range Max ------------------
    static void buildSegmentTree() {
        int size = 4 * n;
        segTree = new int[size];
        build(0, 0, n - 1);
    }

    static void build(int node, int l, int r) {
        if (l == r) {
            segTree[node] = Bonus[l];
            return;
        }
        int mid = (l + r) / 2;
        build(2 * node + 1, l, mid);
        build(2 * node + 2, mid + 1, r);
        segTree[node] = Math.max(segTree[2 * node + 1], segTree[2 * node + 2]);
    }

    static int rangeMax(int ql, int qr) {
        return query(0, 0, n - 1, ql, qr);
    }

    static int query(int node, int l, int r, int ql, int qr) {
        if (r < ql || l > qr) return Integer.MIN_VALUE;
        if (ql <= l && r <= qr) return segTree[node];

        int mid = (l + r) / 2;
        int left = query(2 * node + 1, l, mid, ql, qr);
        int right = query(2 * node + 2, mid + 1, r, ql, qr);
        return Math.max(left, right);
    }
}
