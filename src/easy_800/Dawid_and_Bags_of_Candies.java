package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Dawid_and_Bags_of_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for (int i=0;i<4;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        if((a[0]+a[3]==a[1]+a[2])||a[0]+a[1]+a[2]==a[3] ) System.out.println("YES");
        else System.out.println("NO");
    }
}
