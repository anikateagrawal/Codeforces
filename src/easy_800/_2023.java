package easy_800;

import java.util.Scanner;

public class _2023 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long p=1;
            for (int i=0;i<n;i++)p*=sc.nextInt();
            if(2023%p!=0) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.print(2023/p+" ");
                for (int i=0;i<k-1;i++) System.out.print(1+" ");
                System.out.println();
            }
        }
    }
}
