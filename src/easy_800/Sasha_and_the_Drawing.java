package easy_800;

import java.util.Scanner;

public class Sasha_and_the_Drawing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ans=(k+1)/2;
            if(k==4*n-2) ans++;
            System.out.println(ans);
        }
    }
}
