package easy_1000;

import java.util.Scanner;
import java.util.TreeSet;

public class Luke_is_a_Foodie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int c=0;
            TreeSet<Integer> s=new TreeSet<>();
            for (int i=0;i<n;i++){
                s.add(a[i]);
                if(s.last()-s.first()>2*x){
                    c++;
                    s=new TreeSet<>();
                    s.add(a[i]);
                }
            }
            System.out.println(c);
        }
    }
}
