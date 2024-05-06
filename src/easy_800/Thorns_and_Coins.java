package easy_800;

import java.util.Scanner;

public class Thorns_and_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(s.contains("**"))
            s=s.substring(0,s.indexOf("**"));
            int c=0;
            for(char ch:s.toCharArray())if(ch=='@')c++;
            System.out.println(c);
        }
    }
}
