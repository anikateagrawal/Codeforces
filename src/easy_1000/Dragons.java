package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int d[][]=new int[n][2];
        for(int i=0;i<n;i++){
            d[i][0]=sc.nextInt();d[i][1]=sc.nextInt();
        }
        Arrays.sort(d,(i1,i2)->i1[0]-i2[0]);
        solve(s,n,d);
    }
    static void solve(int s,int n,int d[][]){
        for(int i=0;i<n;i++){
            if(s<=d[i][0]){
                System.out.println("NO");
                return;
            }
            s+=d[i][1];
        }
        System.out.println("YES");
    }
}
