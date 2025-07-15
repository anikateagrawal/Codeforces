package easy_900;

import java.util.Scanner;

public class Also_Try_Minecraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];
        for(int i = 0;i<n;i++)
            a[i] = sc.nextLong();

        long[] left = new long[n];
        long[] right = new long[n];

        for(int i = 1;i<n;i++)
        {
            long x = 0;
            if(a[i]<a[i-1])
                x = a[i-1] - a[i];
            left[i] = left[i-1] + x;
        }

        for(int i = n-2;i>=0;i--)
        {
            long x = 0;
            if(a[i]<a[i+1])
                x = a[i+1] - a[i];

            right[i] = right[i+1] + x;
        }

        while(m-->0)
        {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;

            if(p > q)
                System.out.println(right[q] - right[p]);
            else
                System.out.println(left[q] - left[p]);
        }
    }
}
