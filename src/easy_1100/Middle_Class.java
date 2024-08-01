package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Middle_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int w=0;
            long sum=0;
            for (int i=n-1;i>=0;i--){
                sum+=a[i];
                double avg=1.0*sum/(n-i);
                if(avg>=x)w=n-i;
                else break;
            }
            System.out.println(w);
        }
    }
}
