package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Intercepted_Inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++){
                s.add(sc.nextInt());
            }
            int d=n-2;
            for (int i=1;i*i<=n;i++){
                if(d%i==0){
                    if(s.contains(i) && s.contains(d/i)) {
                        System.out.println(i+" "+(d/i));
                        break;
                    }
                }
            }

        }
    }
}
