package div3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sequence_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int b[]=new int[n];
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            List<Integer> l=new ArrayList<>();
            l.add(b[0]);
            for (int i = 1; i < n; i++) {
                if(b[i]>=b[i-1]){
                    l.add(b[i]);
                }
                else {
                    l.add(b[i]);
                    l.add(b[i]);
                }
            }
            System.out.println(l.size());
            for(int i:l) System.out.print(i+" ");
            System.out.println();
        }
    }
}
