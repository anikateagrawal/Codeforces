package easy_800;

import java.util.Scanner;

public class Two_Subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char ch=s.charAt(0);
            int min=0;
            for (int i=1;i<s.length();i++)
            {
                if (s.charAt(i)<ch){
                    ch=s.charAt(i);
                    min=i;
                }
            }
            System.out.println(ch+" "+s.substring(0,min)+s.substring(min+1));
        }
    }
}
