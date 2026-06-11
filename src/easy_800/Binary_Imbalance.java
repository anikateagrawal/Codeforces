package easy_800;

import java.util.Scanner;

public class Binary_Imbalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if (s.contains("0")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
