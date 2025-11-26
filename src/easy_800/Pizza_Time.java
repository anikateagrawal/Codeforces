package easy_800;

import java.util.Scanner;

public class Pizza_Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int ans=0;
            while (n>2){
                ans+=n/3;
                n=n/3+n%3;
            }
            System.out.println(ans);
        }
    }
}
