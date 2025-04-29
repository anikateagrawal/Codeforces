package easy_800;

import java.util.Scanner;

public class The_Play_Never_Ends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            if(k%3==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
