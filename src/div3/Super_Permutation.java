package div3;

import java.util.*;

public class Super_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==1){
                System.out.println(1);
                continue;
            }
            if((n&1)!=0){
                System.out.println(-1);
                continue;
            }
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n/2;i++){
               l.add(i);
               l.add(n-i-1);
            }
            System.out.print(n+" ");
            for (int i=0;i<n-1;i++){
                System.out.print((l.get(i+1)-l.get(i)+n)%n+" ");
            }
            System.out.println();
        }
    }
}
