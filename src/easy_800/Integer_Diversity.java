package easy_800;

import java.util.Scanner;

public class Integer_Diversity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[500];
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                if(a[v+100]==1){
                    a[-v+100]++;
                }
                else a[v+100]++;
            }
            int ans=0;
            for (int i=0;i<a.length;i++){
                if(a[i]>0)ans++;
            }
            System.out.println(ans);
        }
    }
}
