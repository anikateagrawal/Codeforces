package easy_800;

import java.util.Scanner;

public class Colourblindness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int n=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            for(int i=0;i<n;i++){
                char c1=s1.charAt(i);
                char c2=s2.charAt(i);
                if(c1=='G')c1='B';
                if(c2=='G')c2='B';
                if(c1!=c2){
                    System.out.println("NO");
                    continue outer;
                }
            }
            System.out.println("YES");
        }
    }
}
