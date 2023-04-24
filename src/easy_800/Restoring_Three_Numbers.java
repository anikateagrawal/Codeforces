package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]= sc.nextInt();
        Arrays.sort(a);
        System.out.println((a[3]-a[0])+" "+(a[3]-a[1])+" "+(a[3]-a[2]));

    }
}
