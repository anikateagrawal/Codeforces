package easy_900;

import java.util.Scanner;

public class DIV_MOD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int a=sc.nextInt();
            int q1=r/a;
            int m1=r/a+r%a;
            int m2=0;
            int p2=(q1-1)*a+a-1;
            if(p2>=l&&p2<=r)m2=q1-1+a-1;
            System.out.println(Math.max(m1,m2));
        }
    }
}
