package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snowfall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> three=new ArrayList<>();
            List<Integer> two=new ArrayList<>();
            List<Integer> six=new ArrayList<>();
            List<Integer> other=new ArrayList<>();
            for (int i=0;i<n;i++){
                a[i]= sc.nextInt();
                if (a[i]%6==0)six.add(a[i]);
                else if (a[i]%2==0)two.add(a[i]);
                else if (a[i]%3==0)three.add(a[i]);
                else other.add(a[i]);
            }
            for (int i:three) System.out.print(i+" ");
            for (int i:other) System.out.print(i+" ");
            for (int i:two) System.out.print(i+" ");
            for (int i:six) System.out.print(i+" ");
            System.out.println();
        }
    }
}
