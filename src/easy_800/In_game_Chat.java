package easy_800;

import java.util.Scanner;

public class In_game_Chat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for (int i=s.length()-1;i>=0 && s.charAt(i)==')';i--)c++;
            if(c>n-c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
