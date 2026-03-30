package easy_900;

import java.util.Scanner;

public class XOR_Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==1){
                for (int i=0;i<n;i++) System.out.print(1+" ");
                System.out.println();
            }
            else {
                int sum=n*2-4;
                System.out.print(3+" "+1+" ");
                for (int i=0;i<n-2;i++) System.out.print(2+" ");
                System.out.println();
            }
        }
    }
}
