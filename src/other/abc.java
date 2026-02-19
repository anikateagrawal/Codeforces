package other;


import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean ans=fun(a,1,0);
            if (ans) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
    static boolean fun(int a[],int p,int i){
        if(p==67)return true;
        if(i==a.length)return false;
        boolean ans=fun(a,p*a[i],i+1);
        ans|=fun(a,p,i+1);
        return ans;
    }
}