package easy_1100;

import java.util.Scanner;

public class ABBB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int a=0,b=0;
            for (char ch:s.toCharArray()){
                if(ch=='A')a++;
                else {
                    if(a>0)a--;
                    else if (b>0)b--;
                    else b++;
                }
            }
            System.out.println(a+b);
        }
    }
}
