package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for (int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
        int q=a[0][1];
        for(int i=1;i<n;i++){
            if(a[i][1]<q){
                System.out.println("Happy Alex");
                return;
            }
            q=Math.max(q,a[i][1]);
        }
        System.out.println("Poor Alex");
    }
}
