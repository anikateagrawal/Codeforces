package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Cake_Collection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            long ans=0;
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            for(int i=n-1;i>=0 && m>0;i--){
                ans+=1L*a[i]*m;
                m--;
            }
            System.out.println(ans);
        }
    }
}
