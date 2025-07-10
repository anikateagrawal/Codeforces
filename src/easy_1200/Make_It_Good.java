package easy_1200;

import java.util.Scanner;

public class Make_It_Good {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n=scn.nextInt();
            int a[]= new int[n];
            for (int j = 0; j < a.length; j++)
                a[j]=scn.nextInt();
            int pos = n - 1;
            while (pos > 0 && a[pos - 1] >= a[pos])
                --pos;
            while (pos > 0 && a[pos - 1] <= a[pos])
                --pos;
            System.out.println(pos);
        }
    }
}
