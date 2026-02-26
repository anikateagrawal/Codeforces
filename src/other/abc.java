package other;


import java.util.*;

public class abc {
    public static void main(String[] args) {
        List<List<Long>> q=new ArrayList<>();
        List<Long> l2=new ArrayList<>();
        l2.add(1000L);
        l2.add(3000L);
        q.add(l2);

        long arr[]=new long[1000000];
        for (List<Long> q2:q){
            long left=q2.get(0);
            long right=q2.get(1);
            long sum=0;
            for (long i=left;i<=right;i++){
                sum+=arr[(int)i];
            }
            System.out.println(sum);
        }
    }
}
