package easy_800;

import java.util.Scanner;

public class Andryusha_and_Socks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int socks = 0;
        int ans = 0;
        int[] arr = new int[100001];
        for (int i = 0; i < 2 * n; i++) {
            int sock = sc.nextInt();
            if (arr[sock] == 0) {
                socks++;
                arr[sock]++;
            }

            else socks--;
            ans = Math.max(ans, socks);
        }
        System.out.println(ans);
    }
}
