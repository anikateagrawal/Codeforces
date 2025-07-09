package easy_800;

import java.util.Scanner;

public class Its_Time_To_Duel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s="";
            for (int i=0;i<n;i++)s+=sc.next();
//            System.out.println(s);
            if(s.contains("00")||!s.contains("0")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
