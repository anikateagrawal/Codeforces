package easy_800;

import java.util.Scanner;

public class Joey_Takes_Money {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long p=1;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                p*=a[i];
            }
            System.out.println((p+n-1)*2022L);
        }
    }
}
