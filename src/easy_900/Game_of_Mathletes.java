package easy_900;

import java.util.Scanner;

public class Game_of_Mathletes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();int k=sc.nextInt();
            int a[]=new int[n+1];
            for (int i=0;i<n;i++)a[sc.nextInt()]++;
            int p=0;
            for (int i=1;i<=n;i++){
                int d=k-i;
                if(d<=n && d>0){
                    p+=Math.min(a[i],a[d]);
                }
            }
            System.out.println(Math.min(p/2,n/2));

        }
    }
}
