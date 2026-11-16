package easy_800;

import java.util.Scanner;

public class MEXanized_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if (k>x+1 || k>n) System.out.println(-1);
            else {
                int sum = k*(k-1)/2;
                sum+= (n-k)*x;
                if (x==k)sum-=(n-k);
                System.out.println(sum);
            }
        }
    }
}
