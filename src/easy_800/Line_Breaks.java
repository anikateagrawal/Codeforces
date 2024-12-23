package easy_800;

import java.util.Scanner;

public class Line_Breaks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String a[]=new String[n];
            for (int i=0;i<n;i++)a[i]=sc.next();
            int ans=0;
            for (String s:a){
                if(m-s.length()>=0){
                    m-=s.length();
                    ans++;
                }
                else break;
            }
            System.out.println(ans);
        }
    }
}
