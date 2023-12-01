package medium_1300;

import java.util.Scanner;

public class Product_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a = sc.nextInt(), s=0;
            int[] ans = new int[3];
            for (int z=2;z*z<a && s<2;z++) {
                if (a%z==0) {
                    ans[s] = z;s++;
                    a/=z;
                }
            }
            if (s==2) System.out.println("YES\n"+ans[0]+" "+ans[1]+" "+a);
            else System.out.println("NO");
        }
    }
}
