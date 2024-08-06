package easy_1000;

import java.util.Scanner;

public class Traffic_Light {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            char c=sc.next().charAt(0);
            String s=sc.next();
            if(c=='g'){
                System.out.println(0);continue;
            }
            s=s+s;
            int max=0;
            for (int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch==c){
                    int in=s.indexOf("g",i+1);
                    max=Math.max(max,in-i);
                    i=in;
                }
            }
            System.out.println(max);
        }
    }
}
