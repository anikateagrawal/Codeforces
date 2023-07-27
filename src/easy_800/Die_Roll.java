package easy_800;

import java.util.Scanner;

public class Die_Roll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=7-Math.max(a,b);
        int d=6;
        for(int i=6;i>1;i--){
            if(n%i==0&&d%i==0){
                n/=i;
                d/=i;
            }
        }
        System.out.println(n+"/"+d);
    }
}
