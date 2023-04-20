package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int mul=1;
            List<Integer> l=new ArrayList<>();
            while(n>0){
                int d=n%10;
                if(d!=0){
                    l.add(d*mul);
                }
                mul*=10;
                n/=10;
            }
            System.out.println(l.size());
            for (int i:l) System.out.print(i+" ");
            System.out.println();
        }
    }
}
