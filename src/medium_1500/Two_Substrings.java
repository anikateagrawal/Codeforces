package medium_1500;

import java.util.Scanner;

public class Two_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int fa=s.indexOf("AB");
        int fb=s.indexOf("BA");
        if(fa==-1||fb==-1) System.out.println("NO");
        else{
            int la=s.lastIndexOf("AB");
            int lb=s.lastIndexOf("BA");
            if(Math.abs(la-fb)!=1||Math.abs(fa-lb)!=1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
