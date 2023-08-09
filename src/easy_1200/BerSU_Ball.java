package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class BerSU_Ball {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[m];
        for (int  i=0;i<m;i++)b[i]=sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        int p=0;
        while (i<n&&j<m){
            if(Math.abs(a[i]-b[j])<=1){
                p++;
                i++;
                j++;
            }
            else if(a[i]<b[j])i++;
            else j++;
        }
        System.out.println(p);
    }
}
