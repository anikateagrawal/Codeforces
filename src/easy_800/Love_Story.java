package easy_800;

import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="codeforces";
        int t=sc.nextInt();
        while (t-->0){
            String s2=sc.next();
            int c=0;
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)!=s.charAt(i))c++;
            }
            System.out.println(c);
        }
    }
}
