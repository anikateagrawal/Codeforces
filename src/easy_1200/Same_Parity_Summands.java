package easy_1200;

import java.util.Scanner;

public class Same_Parity_Summands {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int l1=n-(k-1);
            int l2=n-2*(k-1);
            if(l1>0&&l1%2==1){
                System.out.println("YES");
                for (int i = 0; i < k-1; i++) {
                    System.out.print(1+" ");
                }
                System.out.println(l1);
            }
            else if(l2>0&&l2%2==0){
                System.out.println("YES");
                for (int i = 0; i < k-1; i++) {
                    System.out.print(2+" ");
                }
                System.out.println(l2);
            }
            else System.out.println("NO");
        }
    }
}
