package easy_800;

import java.util.Scanner;

public class Sieve_of_Erato67henes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean f=false;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==67)f=true;
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
