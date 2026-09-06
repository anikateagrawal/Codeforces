package easy_800;

import java.util.Scanner;

public class Zero_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int m1=0,o=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]==-1)m1++;else o++;
            }
            if (n%2==1){
                System.out.println("NO");
                continue;
            }
            if ((n/2)%2!=m1%2) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
