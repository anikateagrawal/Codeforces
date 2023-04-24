package div3;

import java.util.Scanner;

public class Bun_Lover {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long ans=26;
            if(n>4){
                n-=4;
                ans+=1L*10*n+1L*(2+(n-1)*2)*n/2;
            }
            System.out.println(ans);
        }
    }
}
