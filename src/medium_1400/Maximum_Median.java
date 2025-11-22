package medium_1400;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int m=a[n/2];
        int c=1;
        for (int i=n/2+1;i<n;i++){
            int d=a[i]-m;
            if(d*c<=k){
                k-=d*c;
                m=a[i];
                c++;
            }
            else {
                m+=k/c;
                k=0;
                break;
            }
        }
        m+=k/c;
        System.out.println(m);
    }
}
