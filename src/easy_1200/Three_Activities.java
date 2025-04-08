package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Three_Activities {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            int b[][]=new int[n][2];
            int c[][]=new int[n][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=i;
            }
            for (int i=0;i<n;i++){
                b[i][0]=sc.nextInt();
                b[i][1]=i;
            }
            for (int i=0;i<n;i++){
                c[i][0]=sc.nextInt();
                c[i][1]=i;
            }
            Arrays.sort(a,(i1,i2)->i2[0]-i1[0]);
            Arrays.sort(b,(i1,i2)->i2[0]-i1[0]);
            Arrays.sort(c,(i1,i2)->i2[0]-i1[0]);
            int ans=0;
            for (int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for (int k=0;k<3;k++){
                        if(a[i][1]!=b[j][1]&&b[j][1]!=c[k][1]&&c[k][1]!=a[i][1]){
                            ans=Math.max(ans,a[i][0]+b[j][0]+c[k][0]);
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
