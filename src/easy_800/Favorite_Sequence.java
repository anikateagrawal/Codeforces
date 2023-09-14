package easy_800;

import java.util.Scanner;

public class Favorite_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int ii=0,j=n-1;
            for (int i=0;i<n;i++){
                if(i%2==1)
                    System.out.print(a[j--]+" ");
                else System.out.print(a[ii++]+" ");
            }
            System.out.println();
        }
    }
}
