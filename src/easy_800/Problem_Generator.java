package easy_800;

import java.util.Scanner;

public class Problem_Generator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String a=sc.next();
            int f[]=new int[7];
            for (char ch:a.toCharArray())f[ch-'A']++;
            int r=0;
            for (int i:f){
                if(i<m)r+=m-i;
            }
            System.out.println(r);
        }
    }
}
