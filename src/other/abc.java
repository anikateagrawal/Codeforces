package other;

import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> rows=new HashSet<>();
            Set<Integer> cols=new HashSet<>();
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    int a=sc.nextInt();
                    if(a==1){
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }
            int ur=n-rows.size();
            int uc=m-cols.size();
            int turns=Math.min(ur,uc);
            System.out.println(turns%2==1?"Ashish":"Vivek");
        }
    }
}
