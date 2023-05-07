package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Gravity_Flip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for (int i:a) System.out.print(i+" ");
    }
}
