package easy_800;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < n; j++) {
                if(a[j]==i){
                    b[i-1]=j+1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
