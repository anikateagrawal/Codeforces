package easy_800;

import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=false;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if(a==1)f=true;
        }
        if(f) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
