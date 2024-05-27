package easy_800;

import java.util.Scanner;

public class Phone_Desktop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int s=0;
            while(x>0||y>0){
                if(y>0){
                    y-=2;
                    x-=7;
                    if(y<0)x-=4;
                }
                else x-=15;
                s++;
            }
            System.out.println(s);
        }
    }
}
