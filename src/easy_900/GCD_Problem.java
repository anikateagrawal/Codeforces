package easy_900;

import java.util.Scanner;

public class GCD_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0){
                System.out.println((n/2)+" "+(n/2-1)+" "+1);
            }
            else {
                int d=n/2;
                if(d%2==0) System.out.println((d-1)+" "+(d+1)+" "+1);
                else System.out.println((d-2)+" "+(d+2)+" "+1);
            }
        }
    }
}
