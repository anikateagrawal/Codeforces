package easy_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divan_and_a_Store {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            long k=sc.nextInt();
            List<Integer> a=new ArrayList<>();
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                if(v<=r&&v>=l)a.add(v);
            }
            Collections.sort(a);
            int max=0;
            for (int i=0;i<a.size();i++){
                if(k-a.get(i)>=0){
                    max++;k-=a.get(i);
                }
                else break;
            }
            System.out.println(max);
        }
    }
}
