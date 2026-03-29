package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Collecting_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=i;
            }
            Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
            long ps[]=new long[n+1];
            for (int i=0;i<n;i++){
                ps[i+1]=ps[i]+a[i][0];
            }
            int ans[]=new int[n];
            int j=0;
            for (int i=0;i<n;i++){
                j=Math.max(i+1,j);
                while (j<n && ps[j]>=a[j][0])j++;
                ans[a[i][1]]=j-1;
            }
            for (int i=0;i<n;i++) System.out.print(ans[i]+" ");
            System.out.println();
        }
    }
}
