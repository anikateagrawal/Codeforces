package easy_1000;

import java.util.Scanner;

public class Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int w=0;int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(i<k-1){
                    if(ch=='W')w++;
                    continue;
                }
                if(ch=='W')w++;
                min=Math.min(min,w);
                if(s.charAt(i-k+1)=='W')w--;

            }
            System.out.println(min);
        }
    }
}
