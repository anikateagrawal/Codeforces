package easy_1100;

import java.util.Scanner;

public class Colorful_Stamp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            s=s.replaceAll("R+","R");
            s=s.replaceAll("B+","B");
            s=s.replaceAll("W+","W");
            String ss[]=s.split("W");
            boolean flag=true;
            for (String w:ss){
                if (w.length()==1){
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
