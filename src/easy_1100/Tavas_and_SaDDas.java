package easy_1100;

import java.util.Scanner;

public class Tavas_and_SaDDas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int l=n.length();
        int ps=(1<<l)-2;
        int pos=0;
        for(int i=l-1;i>=0;i--){
            if(n.charAt(i)=='7'){
                ps+=1<<pos;
            }
            pos++;
        }
        System.out.println(ps+1);
    }
}
