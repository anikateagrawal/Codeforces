package easy_800;

import java.util.Scanner;

public class Beat_The_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int e=0,o=0;
            for(int i=0;i<n;i++){
                if(a[i]%2==0)e++;else o++;
            }
            System.out.println(Math.min(e,o));
        }
    }
}
