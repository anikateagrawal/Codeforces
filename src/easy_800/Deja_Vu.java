package easy_800;

import java.util.Scanner;

public class Deja_Vu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String s1='a'+s;
            String s2=s+'a';
            if (!check(s1)){
                System.out.println("YES");
                System.out.println(s1);
            }
            else if (!check(s2)){
                System.out.println("YES");
                System.out.println(s2);
            }
            else System.out.println("NO");
        }
    }
    static boolean check(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}
