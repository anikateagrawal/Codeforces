package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for (int i=0;i<4;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        if(a[0]+a[1]>a[2]||a[1]+a[2]>a[3]) System.out.println("TRIANGLE");
        else if (a[0]+a[1]==a[2]||a[1]+a[2]==a[3]) System.out.println("SEGMENT");
        else System.out.println("IMPOSSIBLE");
    }
}
