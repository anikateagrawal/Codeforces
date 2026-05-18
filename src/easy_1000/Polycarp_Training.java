package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Polycarp_Training {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans=0;
        for (int i=0;i<n;i++){
            if (a[i]>ans)ans++;
        }
        System.out.println(ans);
    }
}
