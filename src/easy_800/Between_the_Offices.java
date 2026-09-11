package easy_800;

import java.util.Scanner;

public class Between_the_Offices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int sf=0;
        int fs=0;
        for (int i=1;i<n;i++){
            if (s.charAt(i-1)=='F' && s.charAt(i)=='S')fs++;
            else if(s.charAt(i-1)=='S' && s.charAt(i)=='F')sf++;
        }
        if (sf>fs) System.out.println("YES");
        else System.out.println("NO");
    }
}
