package easy_800;

import java.util.Scanner;

public class Alternating_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int i;
            for (i=0;i<n-2;i+=2){
                System.out.print(-1+" "+3+" ");
            }
            if(i<n-1)
            System.out.println(-1+" "+2);
            else System.out.println(-1);
        }
    }
}
