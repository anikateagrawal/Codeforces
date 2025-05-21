package easy_900;

import java.util.Scanner;

public class Expensive_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            boolean flag=false;
            int r=0;
            for (int i=s.length()-1;i>=0;i--){
                int d=s.charAt(i)-'0';
                if(d==0){
                    if(!flag)r++;
                }
                else {
                    flag=true;
                    r++;
                }
            }
            System.out.println(r-1);
        }
    }
}
