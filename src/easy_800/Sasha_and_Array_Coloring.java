package easy_800;

import java.util.*;

public class Sasha_and_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++)l.add(sc.nextInt());
            Collections.sort(l);
            int i=0,j=l.size()-1;
            int ans=0;
            while(i<j){
                ans+=l.get(j)-l.get(i);
                j--;i++;
            }
            System.out.println(ans);
        }
    }
}
