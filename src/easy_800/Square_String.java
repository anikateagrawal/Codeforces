package easy_800;

import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int m=s.length()/2;
            if(s.substring(0,m).equals(s.substring(m))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
