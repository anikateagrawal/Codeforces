package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class All_Distinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            int c=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(s.contains(a))c++;
                else s.add(a);
            }
            int tt=s.size()-c%2;
            System.out.println(tt);
        }
    }
}
