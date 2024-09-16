package easy_800;

import java.util.Scanner;

public class Morning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int p=1;
            int moves=0;
            for (char ch:s.toCharArray()){
                int d=ch-'0';
                if(d==0)d=10;
                int diff=Math.abs(p-d);
                moves+=diff+1;
                p=d;
            }
            System.out.println(moves);
        }
    }
}
