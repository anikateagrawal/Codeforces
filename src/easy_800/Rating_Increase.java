package easy_800;

import java.util.Scanner;

public class Rating_Increase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String a=""+s.charAt(0);
            int in=1;
            while (in<s.length()-1&&s.charAt(in)=='0'){
                a+=s.charAt(in++);
            }
            String b="";
            while (in<s.length()){
                b+=s.charAt(in++);
            }
            int r1=Integer.parseInt(a);
            int r2=Integer.parseInt(b);
            if(r2>r1) System.out.println(r1+" "+r2);
            else System.out.println(-1);

        }
    }
}
