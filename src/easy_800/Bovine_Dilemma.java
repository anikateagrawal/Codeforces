package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bovine_Dilemma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x[]=new int[n];
            for (int i=0;i<n;i++)x[i]=sc.nextInt();
            Set<Double> s=new HashSet<>();
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    double a=0.5*(x[j]-x[i]);
                    s.add(a);
                }
            }
            System.out.println(s.size());
        }
    }
}
