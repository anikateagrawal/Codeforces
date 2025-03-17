package easy_1000;

import java.util.Scanner;

public class Tiles_Comeback {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int i=1;int c=1;int j=n-2;int c2=1;
            while (i<n&&c<k){
                if(a[i]==a[0])c++;
                i++;
            }
            while (j>=0&&c2<k){
                if(a[j]==a[n-1])c2++;
                j--;
            }
//            System.out.println(i+" "+j);
            if(i<=j+1||a[0]==a[n-1]&&c==k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
