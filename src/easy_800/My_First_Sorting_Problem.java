package easy_800;

import java.util.Scanner;

public class My_First_Sorting_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(Math.min(a,b)+" "+Math.max(a,b));
        }
    }
}
