package easy_800;

import java.util.Scanner;

public class LCM_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int x=l;
            int y=2*l;
            if(y<=r) System.out.println(x+" "+y);
            else System.out.println(-1+" "+(-1));
        }
    }
}
