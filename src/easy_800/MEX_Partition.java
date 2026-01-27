package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MEX_Partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++)s.add(sc.nextInt());
            for (int i=0;i<=n;i++){
                if(!s.contains(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
