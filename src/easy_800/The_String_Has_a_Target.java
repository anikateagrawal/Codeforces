package easy_800;

import java.util.Scanner;

public class The_String_Has_a_Target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char min=s.charAt(0);
            int in=0;
            for (int i=1;i<n;i++){
                if (s.charAt(i)<=min){
                    min=s.charAt(i);
                    in=i;
                }
            }
            System.out.println(min+s.substring(0,in)+s.substring(in+1));
        }
    }
}
