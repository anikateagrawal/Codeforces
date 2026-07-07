package easy_1200;

import java.util.Scanner;

public class Secret_Box {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextInt();
            long y=sc.nextInt();
            long z=sc.nextInt();
            long k=sc.nextLong();
            long ans=0;
            for (int i=1;i<=x;i++){
                for (int j=1;j<=y;j++){
                    double b=k/(1.0*i*j);
                    if (b==(int)b && b<=z){
//                        System.out.println(i+" "+j+" "+b);
                        ans=Math.max(ans,(long)((x-i+1)*(y-j+1)*(z-b+1)));
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
