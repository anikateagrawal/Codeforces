package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Phoenix_and_Gold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int tot=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                tot+=a[i];
            }
            if(tot==x) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            Arrays.sort(a);
            int s=0;
            for (int i=0;i<n;i++){
                if (s+a[i]!=x){
                    s+=a[i];
                    System.out.print(a[i]+" ");
                }
                else {
                    System.out.print(a[n-1]+" ");
                    s+=a[n-1];
                    i--;
                    n--;
                }
            }
            System.out.println();
        }
    }
}
