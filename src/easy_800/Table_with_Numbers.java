package easy_800;

import java.util.Scanner;

public class Table_with_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int l=sc.nextInt();
            int a[]=new int[n];
            int b=0,r=0,c=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]<=h && a[i]<=l)b++;
                else if(a[i]<=h)r++;
                else if (a[i]<=l)c++;
            }
            int ans=Math.min(r,c);
            r=r+c-2*ans;
            if(r>=b){
                ans+=b;
            }
            else {
                ans+=r;
                b-=r;
                ans+=b/2;
            }
            System.out.println(ans);
        }
    }
}
