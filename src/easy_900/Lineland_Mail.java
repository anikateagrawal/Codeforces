package easy_900;

import java.util.Scanner;

public class Lineland_Mail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int min[]=new int[n];
        int max[]=new int[n];
        min[0]=a[1]-a[0];
        min[n-1]=a[n-1]-a[n-2];
        for(int i=1;i<n-1;i++){
            min[i]=Math.min(a[i]-a[i-1],a[i+1]-a[i]);
        }
        for(int i=0;i<n;i++){
            max[i]=Math.max(a[n-1]-a[i],a[i]-a[0]);
        }
        for(int i=0;i<n;i++) System.out.println(min[i]+" "+max[i]);
    }
}
