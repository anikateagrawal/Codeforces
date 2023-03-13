package contests;

import java.util.Scanner;

public class Pull_Your_Luck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long sum[]=new long[1000];
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            if(fun(n,x,p)) System.out.println("Yes");
            else System.out.println("No");
        }

    }
    static boolean fun(int n,int x,int p){
        for(int i=1;i<=p&&i<=2*n;i++){
            if((x+1L*i*(i+1)/2)%n==0)return true;
        }
        return false;
    }
}
