package easy_1000;

import java.util.Scanner;

public class Numbers_on_Whiteboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(2);
            System.out.println(n+" "+(n-1));
            for (int i=n;i>2;i--){
                System.out.println(i+" "+(i-2));
            }
        }
    }
}
