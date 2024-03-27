package easy_800;

import java.util.Scanner;

public class Minority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int o=0,n=0;
            for (char ch:s.toCharArray()){
                if(ch=='1')o++;
                else n++;
            }
            int m=0;
            if (n==o)m--;
            System.out.println(Math.min(n,o)+m);
        }
    }
}
