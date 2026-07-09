package easy_800;

import java.util.Scanner;

public class Matching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            if (s.charAt(0)=='0') {
                System.out.println(0);
                continue;
            }
            int ans=9;
            if (s.charAt(0) !='?')ans=1;
            for (int i=1;i<s.length();i++){
                if (s.charAt(i)=='?')ans*=10;
            }
            System.out.println(ans);
        }
    }
}
