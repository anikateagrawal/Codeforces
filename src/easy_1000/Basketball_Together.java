package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Basketball_Together {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt()+1;
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int r=n;
        int ans=0;
        for (int i=n-1;i>=0;i--){
            int p=a[i];
            int b=(d+p-1)/p;
            if(b<=r){
                ans++;
                r-=b;
            }
            else break;
        }
        System.out.println(ans);
    }
}
