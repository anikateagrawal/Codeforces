package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Last_minute_enhancements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++){
                if(s.contains(a[i]))s.add(a[i]+1);
                else s.add(a[i]);
            }
            System.out.println(s.size());
        }
    }
}
