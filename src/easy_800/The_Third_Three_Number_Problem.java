package easy_800;

import java.util.Scanner;

public class The_Third_Three_Number_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0) System.out.println(0+" "+0+" "+(n/2));
            else System.out.println(-1);
        }
    }
}
