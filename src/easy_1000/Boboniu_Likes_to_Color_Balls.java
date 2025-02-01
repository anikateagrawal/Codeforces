package easy_1000;

import java.util.Scanner;

public class Boboniu_Likes_to_Color_Balls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int r=sc.nextInt();
            int g=sc.nextInt();
            int b=sc.nextInt();
            int w=sc.nextInt();
            int o=r%2+g%2+b%2+w%2;
            if(o==1||o==0) System.out.println("YES");
            else {
                if(r>0&&g>0&&b>0 && o>=3) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
