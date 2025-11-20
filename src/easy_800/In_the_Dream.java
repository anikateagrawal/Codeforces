package easy_800;

import java.util.Scanner;

public class In_the_Dream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt()-a;
            int d=sc.nextInt()-b;
            if((a+1)/2>b+1||(b+1)/2>a+1) System.out.println("NO");
            else if((c+1)/2>d+1||(d+1)/2>c+1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
