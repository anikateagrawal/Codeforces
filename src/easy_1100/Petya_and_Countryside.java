package easy_1100;

import java.util.Scanner;

public class Petya_and_Countryside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int ans=1;
        for (int i=0;i<n;i++){
            int c=1;
            for (int j=i-1;j>=0 && a[j]<=a[j+1];j--){
                c++;
            }
            for (int j=i+1;j<n && a[j]<=a[j-1];j++){
                c++;
            }
            ans=Math.max(ans,c);
        }
        System.out.println(ans);
    }
}
