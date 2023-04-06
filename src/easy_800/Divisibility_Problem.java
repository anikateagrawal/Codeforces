package easy_800;

import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a%b!=0)
            System.out.println(b-a%b);
            else System.out.println(0);
        }
    }
}
