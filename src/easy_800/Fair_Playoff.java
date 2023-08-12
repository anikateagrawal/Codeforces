package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Fair_Playoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int s1=sc.nextInt();
            int s2=sc.nextInt();
            int s3=sc.nextInt();
            int s4=sc.nextInt();
            int a[]=new int[4];
            a[0]=s1;a[1]=s2;a[2]=s3;a[3]=s4;
            Arrays.sort(a);
            int p1=Math.max(s1,s2);
            int p2=Math.max(s3,s4);
            if(a[2]==Math.min(p1,p2)&&a[3]==Math.max(p1,p2)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
