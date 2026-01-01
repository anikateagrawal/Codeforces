package easy_800;

import java.util.Scanner;

public class Yes_OrYes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int y=0;
            for (char ch:s.toCharArray())if(ch=='Y')y++;
            if(y<=1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
