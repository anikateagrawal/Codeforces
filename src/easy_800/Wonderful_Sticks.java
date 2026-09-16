package easy_800;

import java.util.Scanner;

public class Wonderful_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int m=1,max=1;
            int a[]=new int[n];
            a[0]=1;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='<'){
                    a[i+1]=--m;
                }
                else a[i+1]=++max;
            }
            m=-1*m;
            for (int i:a) System.out.print((i+m+1)+" ");
            System.out.println();
        }
    }
}
