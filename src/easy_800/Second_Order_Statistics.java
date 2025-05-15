package easy_800;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Second_Order_Statistics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> s=new TreeSet<>();
        for (int i=0;i<n;i++)s.add(sc.nextInt());
        if (s.size()<2) System.out.println("NO");
        else
        System.out.println(new ArrayList<>(s).get(1));
    }
}
