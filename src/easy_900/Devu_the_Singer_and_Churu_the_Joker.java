package easy_900;

import java.util.Scanner;

public class Devu_the_Singer_and_Churu_the_Joker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            int sum=0;
            int d=sc.nextInt();
            for (int i=0;i<n;i++)sum+=sc.nextInt();
            if(sum+(n-1)*10>d) System.out.println(-1);
            else {
                int j=(n-1)*2+(d-(sum+(n-1)*10))/5;
                System.out.println(j);
            }

    }
}
