package other;


import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int fr[]=new int[101];
            int fr2[]=new int[101];
            for (int i:a){
                fr[i]++;
                int f=fr[i];
                fr2[f]++;
            }
            int max=0;
            for (int i=0;i<101;i++){
                max=Math.max(max,fr2[i]*i);
            }
            System.out.println(max);
        }
    }
}
