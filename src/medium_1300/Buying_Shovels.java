package medium_1300;

import java.util.Scanner;

public class Buying_Shovels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int min=Integer.MAX_VALUE;
            for(int i=1;i*i<=n;i++){
                if(i>k)break;
                if(n%i==0){
                    min=Math.min(min,n/i);
                    if(n/i<=k)
                    min=Math.min(min,i);
                }
            }
            System.out.println(min);
        }
    }
}
