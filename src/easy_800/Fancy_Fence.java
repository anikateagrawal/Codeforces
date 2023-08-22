package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Fancy_Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            double n=360.0/(180-a);
            if(n==(int)n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
