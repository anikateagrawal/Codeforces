package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Even_Subset_Sum_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();

            List<Integer> e=new ArrayList<>();
            List<Integer> o=new ArrayList<>();
            for (int i=0;i<n;i++){
                if(a[i]%2==0)e.add(i+1);
                else o.add(i+1);
            }
            if (e.size()>0){
                System.out.println(1);
                System.out.println(e.get(0));
            }
            else {
                if (o.size()>1) {
                    System.out.println(2);
                    System.out.println(o.get(0)+" "+o.get(1));
                }
                else System.out.println(-1);
            }
        }
    }
}
