package easy_800;

import java.util.Scanner;

public class Anti_Fibonacci_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                if (i==3)continue;
                int k=1;
                for (int j=1;j<=n;j++){
                    if (j==i){
                        System.out.print(3+" ");
                        continue;
                    }
                    System.out.print(k+" ");
                    k++;
                    if (k==3)k++;
                }
                System.out.println();
            }
            for (int j=n;j>0;j--) System.out.print(j+" ");
            System.out.println();
        }
    }
}
