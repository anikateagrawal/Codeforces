package easy_900;

import java.util.Scanner;

public class Three_Threadlets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int min=Math.min(a,Math.min(b,c));
            if(a%min!=0||b%min!=0||c%min!=0) System.out.println("NO");
            else{
                int k=a/min+b/min+c/min-3;
                if(k<=3) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
