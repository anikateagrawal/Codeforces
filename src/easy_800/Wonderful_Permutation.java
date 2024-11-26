package easy_800;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Wonderful_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            TreeSet<Integer> tr=new TreeSet<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(b);
            for (int i=0;i<k;i++)tr.add(b[i]);
            int s=0;
            for (int i=0;i<k;i++){
                if(tr.contains(a[i]))continue;
                else s++;
            }
            System.out.println(s);
        }
    }
}
