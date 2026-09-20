package easy_800;

import java.util.Scanner;

public class Shashliks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            int ans=0;
            if (x<y){
                ans=count(k,a,x);
                k-=ans*x;
                ans+=count(k,b,y);
            }
            else{
                ans=count(k,b,y);
                k-=ans*y;
                ans+=count(k,a,x);
            }
            System.out.println(ans);
        }
    }
    static int count(int k, int a, int x){
        if (k<a)return 0;
        int r=k-a;
        int ans=r/x;
        k-=ans*x;
        if (k>=a)ans++;
//        System.out.println(ans);
        return ans;
    }
}
