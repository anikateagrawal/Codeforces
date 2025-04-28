package easy_800;

import java.util.Scanner;

public class Brogramming_Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s="0"+sc.next();
            int c=0;
            for (int i=1;i<=n;i++){
                if(s.charAt(i)!=s.charAt(i-1))c++;
            }
            System.out.println(c);
        }
    }
}
