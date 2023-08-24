package div3;

import java.util.Scanner;

public class Flower_City_Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            if(check(a,n)) System.out.println("YES");
            else System.out.println("NO");
        }

    }
    static boolean check(int a[],int n){
        if(a[0]!=n)return false;
        for (int i=1;i<n;i++){
            if(a[a[i]-1]<i+1)return  false;
        }
        return true;
    }
}
