package easy_1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Playing_in_a_Casino {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            List<List<Integer>> l=new ArrayList<>();
            for (int i=0;i<m;i++)l.add(new ArrayList<>());
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    l.get(j).add(sc.nextInt());
                }
            }
            for (int i=0;i<m;i++) Collections.sort(l.get(i));
            long ans=0;
            for (List<Integer> ll:l){
                long sum=0;
                for (int i=0;i<n;i++){
                    ans+=1L*ll.get(i)*i-sum;
                    sum+=ll.get(i);
                }
            }
            System.out.println(ans);
        }
    }
}
