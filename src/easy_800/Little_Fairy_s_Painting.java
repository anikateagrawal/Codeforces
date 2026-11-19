package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Little_Fairy_s_Painting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++)s.add(sc.nextInt());
            while (!s.contains(s.size()))s.add(s.size());
            System.out.println(s.size());
        }
    }
}
