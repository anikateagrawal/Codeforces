package easy_800;

import java.util.Scanner;

public class Patrick_and_Shopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();int d2=sc.nextInt();int d3=sc.nextInt();
        int ans=0;
        ans+=Math.min(d1,d2)+Math.min(d3,d1+d2)+Math.min(Math.max(d1,d2),d3+Math.min(d1,d2));
        System.out.println(ans);
    }
}
