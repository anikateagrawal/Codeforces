package easy_1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int min=Integer.MAX_VALUE;
            int smin=Integer.MAX_VALUE;
            long sum=0;
            for (int i=0;i<n;i++){
                int m=sc.nextInt();
                List<Integer> ll=new ArrayList<>();
                for (int j=0;j<m;j++)ll.add(sc.nextInt());
                Collections.sort(ll);
                if(ll.get(0)<min){
                    min=ll.get(0);
                }
                if(ll.get(1)<smin){
                    smin=ll.get(1);
                }
                sum+=ll.get(1);
            }
            System.out.println(sum+min-smin);
        }
    }
}
