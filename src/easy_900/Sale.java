package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int sum=0;
        for (int i=0;i<m;i++){
            if(a[i]<0)
            sum+=a[i];
            else break;
        }
        System.out.println(-1*sum);
    }
}
