package easy_800;

import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>b&&a>c) System.out.print(0+" ");
            else System.out.print(Math.max(b,c)-a+1+" ");
            if(b>a&&b>c) System.out.print(0+" ");
            else System.out.print(Math.max(a,c)-b+1+" ");
            if(c>a&&c>b) System.out.println(0);
            else System.out.println(Math.max(a,b)-c+1);
        }
    }
}
