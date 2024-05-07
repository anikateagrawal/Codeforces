package easy_900;

import java.util.Scanner;

public class The_Corridor_or_There_and_Back_Again {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int d=sc.nextInt();
                int s=sc.nextInt();
                d+=(s-1)/2;
                k=Math.min(k,d);
            }
            System.out.println(k);
        }
    }
}
