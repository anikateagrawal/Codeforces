package easy_800;

import java.util.Scanner;

public class Maximum_Increase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=1;
        int c=1;
        for (int i = 0; i < n-1; i++) {
            if(a[i+1]>a[i])c++;
            else{
                s=Math.max(s,c);
                c=1;
            }
        }
        System.out.println(Math.max(s,c));
    }
}
