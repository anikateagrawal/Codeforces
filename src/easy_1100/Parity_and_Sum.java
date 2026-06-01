package easy_1100;

import java.util.*;

public class Parity_and_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> o=new ArrayList<>();
            List<Integer> e=new ArrayList<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]%2==1)o.add(a[i]);
                else e.add(a[i]);
            }
            int op=0;
            Collections.sort(o);
            Collections.sort(e);
            if (o.size()==0) System.out.println(0);
            else {
                long odd=o.get(o.size()-1);
                int i=0;
                while (i<e.size()){
                    op++;
                    int even=e.get(i);
                    if (even<odd)i++;
                    odd=even+odd;
                }
                System.out.println(op);
            }
        }
    }
}
