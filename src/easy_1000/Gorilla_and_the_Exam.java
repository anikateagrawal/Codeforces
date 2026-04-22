package easy_1000;

import java.util.*;

public class Gorilla_and_the_Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            for (int i:a)m.put(i,m.getOrDefault(i,0)+1);
            List<Integer> l=new ArrayList<>(m.values());
            Collections.sort(l);
            int s=l.size();
            int ans=1;
            for (int i=0;i<s;i++){
                if (l.get(i)>k){
                    ans=s-i;
                    break;
                }
                k-=l.get(i);
            }
            System.out.println(ans);
        }
    }
}
