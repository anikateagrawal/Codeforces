package easy_800;

import java.util.Scanner;

public class Non_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int z=0;
            int s=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==0)z++;
                s+=a[i];
            }
            s+=z;
            if(s==0)z++;
            System.out.println(z);
        }
    }
}
