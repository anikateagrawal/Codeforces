package easy_900;

import java.util.Scanner;

public class Number_of_Apartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int n3=0,n5=0,n7=0;
            if(n<=2||n==4) System.out.println(-1);
            else {
                n3=n/3;
                int r=n%3;
                if(r==1){
                    n7++;
                    n3-=2;
                }
                else if(r==2){
                    n3--;n5++;
                }
                System.out.println(n3+" "+n5+" "+n7);
            }
        }
    }
}
