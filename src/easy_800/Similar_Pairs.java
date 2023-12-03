package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Similar_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int e=0,o=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0)e++;
                else o++;
            }
            Arrays.sort(a);
            int c=0;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1]+1)c++;
            }
            if(e%2==o%2){
                if(e%2==1){
                    if(c>0) System.out.println("YES");
                    else System.out.println("NO");
                }
                else
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
