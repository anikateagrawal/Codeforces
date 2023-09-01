package easy_800;

import java.util.Scanner;

public class Cards_for_Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while (tt-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            int n=sc.nextInt();
            int t=1;
            while(w%2==0||h%2==0){
                if(w%2==0){
                    t*=2;
                    w/=2;
                }
                else if(h%2==0){
                    t*=2;
                    h/=2;
                }
            }
//            System.out.println(t);
            if(t>=n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
