package easy_800;

import java.util.Scanner;

public class Unit_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int s=0,ng=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s+=a[i];
                if(a[i]<0)ng++;
            }
            int ans=0;
            if(s<0){
                s=-1*s;
                ans=(s+1)/2;
                ng-=ans;
            }
            ans+=ng%2;
            System.out.println(ans);

        }
    }
}
