package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Team_Training {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();int x=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int ans=0;int c=1;
            for (int i=n-1;i>=0;i--){
                if(a[i]*c>=x){
                    ans++;
                    c=1;
                }
                else c++;
            }
            System.out.println(ans);
        }
    }
}
