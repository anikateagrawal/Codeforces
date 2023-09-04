package easy_800;

import java.util.Scanner;

public class Odd_Set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int even=0,odd=0;
            for (int i = 0; i < 2*n; i++) {
                int a=sc.nextInt();
                if(a%2==0)even++;
                else odd++;
            }
            if(odd==even) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
