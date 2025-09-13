package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Cherry_Bomb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[][]=new int[n][2];
            for (int i=0;i<n;i++)a[i][0]=sc.nextInt();
            for (int i=0;i<n;i++)a[i][1]=sc.nextInt();
            Arrays.sort(a,(i1, i2)->i1[1]==i2[1]?i1[0]-i2[0]:i1[1]-i2[1]);
            if(a[n-1][1]==-1){
                int d=k-(a[n-1][0]-a[0][0])+1;
                if(d<0) System.out.println(0);
                else System.out.println(d);
            }
            else {
                boolean flag=true;
                int x=a[n-1][0]+a[n-1][1];
                for(int i=n-1;i>=0;i--){
                    if(a[i][1]==-1){
                        if(x-a[i][0]>k || x-a[i][0]<0)flag=false;
                    }
                    else if(a[i][0]+a[i][1]!=x){
                        flag=false;
                        break;
                    }
                }
                if(!flag) System.out.println(0);
                else System.out.println(1);
            }
        }
    }
}
