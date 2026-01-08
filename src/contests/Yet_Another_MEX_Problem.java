package contests;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Yet_Another_MEX_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++)s.add(sc.nextInt());
            boolean done=false;
            for (int i=0;i<k-1;i++){
                if(!s.contains(i)){
                    System.out.println(i);
                    done=true;
                    break;
                }
            }
            if (!done) System.out.println(k-1);
        }
    }
}
