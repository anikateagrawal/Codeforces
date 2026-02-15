package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Divan_and_a_New_Project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=i+1;
            }
            Arrays.sort(a,(i1,i2)->i2[0]-i1[0]);
            int ans[]=new int[n+1];
            ans[0]=0;
            int d=1;
            long time=0;
            for (int i=0;i<n;i+=2){
                ans[a[i][1]]=d;
                time+=2L*d*a[i][0];
                if(i<n-1){
                    ans[a[i+1][1]]=-1*d;
                    time+=2L*d*a[i+1][0];
                }
                d++;
            }
            System.out.println(time);
            for (int i:ans) System.out.print(i+" ");
            System.out.println();
        }
    }
}
