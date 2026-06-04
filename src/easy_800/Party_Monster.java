package easy_800;

import java.util.Scanner;

public class Party_Monster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int o=0,c=0;
            for (char ch:s.toCharArray()){
                if (ch=='(')o++;
                else c++;
            }
            if (o==c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
