package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[][]=new int[4][2];
            for(int i=0;i<4;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
            }
            Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
            System.out.println((int)Math.pow(Math.abs(a[0][1]-a[1][1]),2));

        }
    }
}
