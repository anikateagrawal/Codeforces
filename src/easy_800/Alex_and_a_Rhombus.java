package easy_800;

import java.util.Scanner;

public class Alex_and_a_Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        for (int i=1;i<n;i++){
            s+=(4*i);
        }
        System.out.println(s);
    }
}
