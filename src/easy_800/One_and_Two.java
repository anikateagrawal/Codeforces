package easy_800;

import java.util.Scanner;

public class One_and_Two
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int t2=0;
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==2)t2++;
            }
            int ans=-1;
            int t1=0;
            for(int i=0;i<n-1;i++){
                if(a[i]==2)t1++;
                if(t1==t2-t1){
                    ans=i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
