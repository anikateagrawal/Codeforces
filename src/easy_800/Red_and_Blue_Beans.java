package easy_800;

import java.util.Scanner;

public class Red_and_Blue_Beans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int r=sc.nextInt();
            int b=sc.nextInt();
            int d=sc.nextInt();
            int min=Math.min(r,b);
            int max=Math.max(r,b);
            long p=min+1L*min*(d);
            if(max<=p) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
