package easy_800;

import java.util.Scanner;

public class Circuit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=0;
            for (int i=0;i<2*n;i++){
                s+=sc.nextInt();
            }
            if(s>n) System.out.println(s%2+" "+(2*n-s));
            else  System.out.println(s%2+" "+(Math.min(s,n)));

        }
    }
}
