package easy_900;

import java.util.Scanner;

public class Dual_Trigger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int o=0;
            for (char ch:s.toCharArray())if (ch=='1')o++;
            if (o%2==1|| o==2 && s.contains("11")) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
