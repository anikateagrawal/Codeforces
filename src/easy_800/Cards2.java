package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Cards2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for (int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=i+1;
        }
        Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
        for (int i=0;i<n/2;i++){
            System.out.println(a[i][1]+" "+a[n-i-1][1]);
        }
    }
}
