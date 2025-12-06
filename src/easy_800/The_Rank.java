package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class The_Rank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for (int i=0;i<n;i++){
            int s=0;
            s+=sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
            a[i][0]=s;
            a[i][1]=i;
        }
        Arrays.sort(a,(i1,i2)->i2[0]-i1[0]);
        int r=-1;
        for (int i=0;i<n;i++){
            if(a[i][1]==0)r=i;
        }
        System.out.println(r+1);
    }
}
