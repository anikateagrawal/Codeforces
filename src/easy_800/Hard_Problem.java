package easy_800;

import java.util.Scanner;

public class Hard_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int m=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int ans=Math.min(a+c,m);
            if(ans>a)c-=ans-a;
            ans+=Math.min(b+c,m);
            System.out.println(ans);
        }
    }
}
