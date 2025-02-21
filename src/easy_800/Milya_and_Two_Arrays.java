package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Milya_and_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> a=new HashSet<>();
            for (int i=0;i<n;i++)a.add(sc.nextInt());
            Set<Integer> b=new HashSet<>();
            for (int i=0;i<n;i++)b.add(sc.nextInt());
            if(a.size()>2||b.size()>2) System.out.println("YES");
            else if(a.size()==2&&b.size()==2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
