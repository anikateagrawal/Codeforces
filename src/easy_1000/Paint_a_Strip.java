package easy_1000;

import java.util.Scanner;

public class Paint_a_Strip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int op=1;
            int l=1;
            while (l<n){
                op++;
                int ones=l+1;
                int r=ones*2;
                l=r;
            }
            System.out.println(op);
        }
    }
}
