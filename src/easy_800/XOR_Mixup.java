package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class XOR_Mixup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=0;int a[]=new int[n];
            Set<Integer> s=new HashSet<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                x^=a[i];
                s.add(a[i]);
            }
            for(int i=0;i<n;i++){
                if((x^a[i])==a[i]){
                    System.out.println(a[i]);break;
                }
            }
        }
    }
}
