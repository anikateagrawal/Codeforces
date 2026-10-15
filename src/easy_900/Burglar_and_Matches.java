package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Burglar_and_Matches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[m][2];
        for (int i=0;i<m;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,(i1,i2)->i2[1]-i1[1]);
        int i=0;
        long ans=0;
        while(n>0){
            if (n>a[i][0]){
                ans+=a[i][0]*a[i][1];
                n-=a[i][0];
                i++;
            }
            else {
                ans+=n*a[i][1];
                n=0;
            }
        }
        System.out.println(ans);
    }
}
