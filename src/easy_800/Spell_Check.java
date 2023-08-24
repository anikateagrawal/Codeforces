package easy_800;

import java.util.Scanner;

public class Spell_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(n!=5) System.out.println("NO");
            else{
                if(s.contains("T")&&s.contains("i")&&s.contains("m")&&s.contains("u")&&s.contains("r"))
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
