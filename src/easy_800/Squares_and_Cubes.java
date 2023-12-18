package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Squares_and_Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Long> s=new HashSet<>();
            for(long i=1;i*i<=n;i++){
                s.add(i*i);
                if(i*i*i<=n)s.add(i*i*i);
            }
            System.out.println(s.size());
        }
    }
}
