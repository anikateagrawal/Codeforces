package easy_800;

import java.util.Scanner;

public class Moo_Language_School {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            boolean school[] = new boolean[n/k];
            for (int i=0;i<n;i++){
                char ch=s.charAt(i);
                int f=i/k;
                if (ch=='0')school[f]=true;
            }
            int ans=0;
            for (boolean f:school)if (!f)ans++;
            System.out.println(ans);
        }
    }
}
