package easy_800;

import java.util.Scanner;

public class Yes_Yes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String y="Yes";
            String a="";
            while(a.length()<s.length()){
                a+="Yes";
            }
            a+="Yes";
            if(a.contains(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
