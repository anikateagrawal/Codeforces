package easy_800;

import java.util.Scanner;

public class Computer_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String s2=sc.next();
            boolean flag=true;
            for (int i=0;i<n;i++){
                char c1=s.charAt(i);
                char c2=s2.charAt(i);
                if(c1=='1' && c2=='1'){
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
