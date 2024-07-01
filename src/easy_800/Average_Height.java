package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average_Height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> o=new ArrayList<>();
            List<Integer> e=new ArrayList<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a%2==0)e.add(a);
                else o.add(a);
            }
            for (int i:o) System.out.print(i+" ");
            for (int i:e) System.out.print(i+" ");
            System.out.println();
        }
    }
}
