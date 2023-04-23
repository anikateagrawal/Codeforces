package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t[]=new int[3];
        t[0]=sc.nextInt();
        t[1]=sc.nextInt();
        t[2]=sc.nextInt();
        Arrays.sort(t);
        System.out.println(t[2]-t[0]);

    }
}
