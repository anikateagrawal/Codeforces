package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Turtle_and_Piggy_Are_Playing_a_Game_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            System.out.println(a[n/2]);
        }
    }
}
