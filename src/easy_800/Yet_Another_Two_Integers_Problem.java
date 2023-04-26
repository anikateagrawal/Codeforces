package easy_800;

import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d=Math.abs(a-b);
            int ans=d/10;
            if(d%10!=0)ans+=1;
            System.out.println(ans);
        }
    }
}
