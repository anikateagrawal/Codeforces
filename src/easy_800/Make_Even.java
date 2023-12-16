package easy_800;

import java.util.Scanner;

public class Make_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0) {
                System.out.println(0);continue;
            }
            String s=""+n;
            if(s.charAt(0)%2==0) System.out.println(1);
            else {
                boolean f=true;
                for (char ch:s.toCharArray()){
                    if((ch)%2==0){
                        f=false;
                        System.out.println(2);
                        break;
                    }
                }
                if(f) System.out.println(-1);
            }
        }
    }
}