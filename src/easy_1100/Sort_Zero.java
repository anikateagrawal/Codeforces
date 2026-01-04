package easy_1100;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sort_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            int p=0;
            for (int i=1;i<n;i++){
                if(a[i]<a[i-1]){
                    for (int j=p;j<i;j++){
                        s.add(a[j]);
                    }
                    p=i;
                }
                if(s.contains(a[i])){
                    for (int j=p;j<i;j++){
                        s.add(a[j]);
                    }
                    p=i;
                }
            }
            System.out.println(s.size());
        }
    }
}
