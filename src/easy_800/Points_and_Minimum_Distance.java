package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Points_and_Minimum_Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[2*n];
            for (int i=0;i<2*n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int in=0;
            int a2[][]=new int[n][2];
            for (int i=0;i<n;i++){
                a2[i][0]=a[in++];
            }
            for (int i=0;i<n;i++){
                a2[i][1]=a[in++];
            }
            int ans=0;
            for (int i=0;i<n-1;i++){
                ans+=a2[i+1][0]-a2[i][0]+a2[i+1][1]-a2[i][1];
            }
            System.out.println(ans);
            for (int i=0;i<n;i++){
                System.out.println(a2[i][0]+" "+a2[i][1]);
            }
        }
    }
}
