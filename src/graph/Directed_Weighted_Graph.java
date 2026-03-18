package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
// directed weighted graph
5
5
0 1 2
0 2 3
1 4 5
2 3 1
3 1 2

 */
public class Directed_Weighted_Graph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        List<List<int[]>> graph=new ArrayList<>();
        for (int i=0;i<v;i++)graph.add(new ArrayList<>());
        for (int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            int w=sc.nextInt();
            graph.get(s).add(new int[]{d,w});
        }
        for (int i=0;i<v;i++){
            System.out.print("Vertex "+i+"  Neighbours-> ");
            for (int nb[]:graph.get(i)){
                System.out.print(Arrays.toString(nb));
            }
            System.out.println();
        }
    }
}
