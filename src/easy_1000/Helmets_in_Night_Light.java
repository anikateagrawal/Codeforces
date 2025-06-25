package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Helmets_in_Night_Light {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p=sc.nextInt();
            int a[][]=new int[n+1][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
            }
            for (int i=0;i<n;i++)a[i][1]=sc.nextInt();
            a[n][0]=n;
            a[n][1]=p;
            long ans=p;
            int c=1;
            Arrays.sort(a,(i1,i2)->i1[1]-i2[1]);
            for (int i=0;i<n && c<n;i++){
                if(c+a[i][0]<n){
                    c+=a[i][0];
                    ans+=1L*a[i][1]*a[i][0];
                }
                else {
                    ans+=1L*a[i][1]*(n-c);
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
