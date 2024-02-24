package easy_800;

import java.util.Scanner;

public class Yet_Another_Bookshelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int l=-1,r=-1;
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==1){
                    if(l==-1)l=i;
                    r=i;
                }
            }
            for(int i=l;i<=r;i++)if(a[i]==0)c++;
            System.out.println(c);
        }
    }
}
