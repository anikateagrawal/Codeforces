package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int p=n-1;
            for(int i=0;i<n-1;i++){
                if(a[i]<a[i+1]){
                    p=i;
                    break;
                }
            }
            System.out.println(n-p-1);
        }
    }
}
