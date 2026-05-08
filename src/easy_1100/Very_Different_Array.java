package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Very_Different_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[m];
            for (int i=0;i<m;i++)b[i]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int i=0,j=n-1;
            int x=0,y=m-1;
            long ans=0;
            while (i<=j){
                if (Math.abs(a[i]-b[y])>=Math.abs(a[j]-b[x])){
                    ans+=Math.abs(a[i]-b[y]);
                    i++;
                    y--;
                }
                else {
                    ans+=Math.abs(a[j]-b[x]);
                    j--;
                    x++;
                }
            }
            System.out.println(ans);
        }
    }
}
