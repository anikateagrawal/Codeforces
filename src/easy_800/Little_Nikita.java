package easy_800;

import java.util.Scanner;

public class Little_Nikita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m>n) System.out.println("NO");
            else {
                int d=n-m;
                if(d%2==0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
