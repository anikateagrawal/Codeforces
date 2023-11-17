package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for(int i=0;i<n;i++)s.add(sc.nextInt());
            if(s.contains(k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
