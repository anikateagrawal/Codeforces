package easy_1000;

import java.util.Scanner;

public class Xenia_and_Ringroad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long ans=0;
        long cur=0;
        for(int i=0;i<m;i++){
            int h=sc.nextInt()-1;
            if(h>=cur){
                ans+=h-cur;
                cur=h;
            }
            else{
                ans+=h+n-cur;
                cur=h;
            }
        }
        System.out.println(ans);
    }
}
