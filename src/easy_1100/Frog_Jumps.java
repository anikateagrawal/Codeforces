package easy_1100;

import java.util.Scanner;

public class Frog_Jumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next()+"R";
            int max=-1;
            int pr=-1;
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)=='R'){
                    max=Math.max(max,i-pr);
                    pr=i;
                }
            }
            System.out.println(max);
        }
    }
}
