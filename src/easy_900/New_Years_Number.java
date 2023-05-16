package easy_900;

import java.util.Scanner;

public class New_Years_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=n/2020;
            int o=n%2020;
            if(o<=d) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
