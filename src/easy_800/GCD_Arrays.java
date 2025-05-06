package easy_800;

import java.util.Scanner;

public class GCD_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int k=sc.nextInt();
            int o=(r+1)/2-l/2;
            if(l==r&&l>1){
                System.out.println("YES");
                continue;
            }
            if(o>k) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
