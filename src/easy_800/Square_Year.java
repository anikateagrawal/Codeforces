package easy_800;

import java.util.Map;
import java.util.Scanner;

public class Square_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int y=sc.nextInt();
            boolean flag = false;
            outer:
            for (int a=0;a<=100;a++){
                for (int b=0;b<=100;b++){
                    int s=a+b;
                    if(s*s==y){
                        System.out.println(a+" "+b);
                        flag=true;
                        break outer;
                    }
                }
            }
            if(!flag) System.out.println(-1);
        }
    }
}
