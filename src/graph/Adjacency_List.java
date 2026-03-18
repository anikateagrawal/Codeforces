package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adjacency_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        List<List<Integer>> adj=new ArrayList<>();
        for (int i=0;i<v;i++)adj.add(new ArrayList<>());
        for (int i=0;i<e;i++){
            // undirected unweighted graph
            int s=sc.nextInt();
            int d=sc.nextInt();
            adj.get(s).add(d);
            adj.get(d).add(s);
        }
        for (int i=0;i<v;i++){
            System.out.println(i+" -> " +adj.get(i));
        }
    }
}
