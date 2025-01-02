package easy_800;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Subsequence_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            Arrays.sort(a);
            int i=0;
            int c=0;
            for (char ch:s.toCharArray()){
                if(ch!=a[i++])c++;
            }
            System.out.println(c);
        }
    }
}
