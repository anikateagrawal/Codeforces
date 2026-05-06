package easy_900;

import java.util.Scanner;

public class Not_a_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            if (s.equals("()")) System.out.println("NO");
            else {
                System.out.println("YES");
                int n=s.length();
                String s1="";
                for (int i=0;i<n;i++)s1+="(";
                for (int i=0;i<n;i++)s1+=")";
                String s2="";
                for (int i=0;i<n;i++)s2+="()";
                if (s1.contains(s)) System.out.println(s2);
                else System.out.println(s1);
            }
        }
    }
}
