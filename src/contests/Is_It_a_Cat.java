package contests;

import java.util.Scanner;

public class Is_It_a_Cat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next().toLowerCase();
            if(fun(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean fun(String s){
        int i=0;
        while(i<s.length()&&s.charAt(i)=='m')i++;
        if(i==0||i==s.length())return false;
        int j=i;
        while (j<s.length()&&s.charAt(j)=='e')j++;
        if(j==i||j==s.length())return false;
        i=j;
        while (j<s.length()&&s.charAt(j)=='o')j++;
        if (j==i||j==s.length())return false;
        i=j;
        while (j<s.length()&&s.charAt(j)=='w')j++;
        if (i==j||j!=s.length())return false;
        return true;
    }
}
