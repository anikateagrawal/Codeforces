package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int c=0;
        for (int i=n-1;i>=0;i--){
            if(!s.contains(a[i])){
                s.add(a[i]);c++;
            }
            else a[i]=0;
        }
        System.out.println(c);
        for (int i=0;i<n;i++)if (a[i]!=0) System.out.print(a[i]+" ");
    }
}
