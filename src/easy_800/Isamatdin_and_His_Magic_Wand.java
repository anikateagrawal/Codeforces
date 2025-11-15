package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Isamatdin_and_His_Magic_Wand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int o=0,e=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0)e++;
                else o++;
            }
            if(e>0 && o>0) Arrays.sort(a);
            for (int i:a) System.out.print(i+" ");
            System.out.println();

        }
    }
}
