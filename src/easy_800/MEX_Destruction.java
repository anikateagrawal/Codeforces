package easy_800;

import java.util.Scanner;

public class MEX_Destruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while(q--!=0) {
            int n = sc.nextInt();
            int cnt = 0, pre = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (pre == 0 && x != 0) {
                    cnt++;
                }

                pre = x;
            }

            int ans = (cnt >= 2) ? 2 : cnt;
            System.out.println(ans);
        }
    }
}
