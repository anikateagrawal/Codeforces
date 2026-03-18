package graph;

import java.util.HashMap;
import java.util.Scanner;

public class Graph_String_Vertices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        HashMap<String,HashMap<String,Integer>> graph=new HashMap<>();
        for(int i=0;i<e;i++){
            String s=sc.next();
            String d=sc.next();
            int w=sc.nextInt();
            HashMap<String,Integer> nbs=graph.computeIfAbsent(s,k->new HashMap<>());
            nbs.put(d,w);
            HashMap<String,Integer> nbs2=graph.computeIfAbsent(d,k->new HashMap<>());
            nbs2.put(s,w);
        }
        for (String s:graph.keySet()){
            System.out.println(s+" => "+ graph.get(s));
        }

    }
}
