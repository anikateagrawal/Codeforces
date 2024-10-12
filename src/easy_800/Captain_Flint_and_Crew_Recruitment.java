package easy_800;

import java.util.Scanner;

public class Captain_Flint_and_Crew_Recruitment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n>30) {
                int r=n-30;
                int a=6,b=10,c=14;
                if(r==a||r==b||r==c){
                    r--;
                    c++;
                }
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c+" "+r);
            }
            else System.out.println("NO");
        }
    }
}
