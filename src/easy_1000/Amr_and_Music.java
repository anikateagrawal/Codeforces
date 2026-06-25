package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Amr_and_Music {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[][]=new int[n][2];
        for (int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=i+1;
        }
        Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
        int i;
        for (i=0;i<n;i++){
            if (a[i][0]<=k){
                k-=a[i][0];
            }
            else break;
        }
        System.out.println(i);
        for (int j=0;j<i;j++) System.out.print(a[j][1]+" ");
    }
}
