package easy_1100;

import java.util.HashSet;
import java.util.Scanner;

public class Subtract_Operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        out:
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer> hs=new HashSet();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                hs.add(a[i]);
            }

            for(int i=0;i<n;i++){
                if(hs.contains(a[i]+k)){
                    System.out.println("YES");
                    continue out;
                }
            }
            System.out.println("NO");
        }
    }
}
