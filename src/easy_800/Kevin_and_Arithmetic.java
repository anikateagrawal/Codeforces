package easy_800;

import java.util.Scanner;

public class Kevin_and_Arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int o=0,e=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0)e++;
                else o++;
            }
            int ans=0;
            if(e>0){
                ans=1;
                ans+=o;
            }
            else {
                ans+=o-1;
            }
            System.out.println(ans);
        }
    }
}
