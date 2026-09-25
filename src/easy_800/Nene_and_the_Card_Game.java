package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Nene_and_the_Card_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            int ans=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (s.contains(a))ans++;
                else s.add(a);
            }
            System.out.println(ans);
        }
    }
}
