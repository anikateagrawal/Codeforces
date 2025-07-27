package easy_1000;

import java.util.Scanner;

public class Need_More_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int p=-1;
            int ans=0;
            for (int i=0;i<n;i++){
                if(a[i]<=p+1){
                    continue;
                }
                ans++;
                p=a[i];
            }
            System.out.println(ans);
        }
    }
}
