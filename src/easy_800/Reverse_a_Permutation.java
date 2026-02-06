package easy_800;

import java.util.Scanner;

public class Reverse_a_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int f=n;
            if(a[0]==n)f--;
            int in=-1;
            for(int i=0;i<n;i++){
                if(a[i]==f)in=i;
            }
            int j=in,i=0;
            if(f!=n)i++;
            while (i<j){
                int tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                i++;j--;
            }
            for (int num:a) System.out.print(num+" ");
            System.out.println();
        }
    }
}
