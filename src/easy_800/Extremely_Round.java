package easy_800;

import java.util.Scanner;

public class Extremely_Round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int ans=0;
            while(n>0){
                if(n/10==0){
                    ans+=n%10;
                }
                else ans+=9;
                n/=10;
            }
            System.out.println(ans);
        }
    }
}
