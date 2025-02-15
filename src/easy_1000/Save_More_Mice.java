package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Save_More_Mice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int m[]=new int[k];
            for (int i=0;i<k;i++)m[i]=sc.nextInt();
            Arrays.sort(m);
            int j=k-1;
            int c=0;
            while (j>=0 && c<m[j] ){
                c+=n-m[j];
                j--;
            }
            System.out.println(k-j-1);
        }
    }
}
