package easy_800;

import java.util.Scanner;

public class No_Casino_in_the_Mountains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=0;
            int c=0;
            for (int i=0;i<n;i++){
                if(a[i]==1){
                    c=0;
                }
                else c++;
                if(c==k){
                    ans++;
                    i++;
                    c=0;
                }
            }
            System.out.println(ans);
        }
    }
}
