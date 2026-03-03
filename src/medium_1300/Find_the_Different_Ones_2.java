package medium_1300;

import java.util.Scanner;

public class Find_the_Different_Ones_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int b[]=new int[n];
            b[0]=0;
            for (int i=1;i<n;i++){
                if(a[i]==a[i-1]){
                    b[i]=b[i-1];
                }
                else b[i]=i;
            }
            int q=sc.nextInt();
            while (q-->0){
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                int i=b[l];
                int j=b[r];
                if(i==j) System.out.println(-1+" "+(-1));
                else{
                    while (a[i]==a[j]){
                        j=b[j-1];
                    }
                    l++;j++;
                    System.out.println(l+" "+j);
                }
            }
            System.out.println();
        }
    }
}
