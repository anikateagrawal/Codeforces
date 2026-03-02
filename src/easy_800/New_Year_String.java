package easy_800;

import java.util.Scanner;

public class New_Year_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if (s.contains("2026")||!s.contains("2025")) System.out.println(0);
            else System.out.println(1);
        }
    }
}
