package easy_800;

import java.util.Scanner;

public class Three_swimmers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long p=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long ta=p%a==0?0:a-p%a;
            long tb=p%b==0?0:b-p%b;
            long tc=p%c==0?0:c-p%c;
            long ans=Math.min(ta,Math.min(tb,tc));
            System.out.println(ans);
        }
    }
}
