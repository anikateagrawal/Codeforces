package easy_900;

import java.util.Scanner;

public class BAN_BAN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println((n+1)/2);
            int in=2,j=n*3;
            for (int i=0;i<(n+1)/2;i++){
                System.out.println(in+" "+j);
                in+=3;
                j-=3;
            }
        }
    }
}
