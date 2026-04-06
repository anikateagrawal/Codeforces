package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class The_67th_6_7_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[7];
            for (int i=0;i<7;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int sum=0;
            for (int i=0;i<6;i++)sum+=a[i]*-1;
            sum+=a[6];
            System.out.println(sum);
        }
    }
}
