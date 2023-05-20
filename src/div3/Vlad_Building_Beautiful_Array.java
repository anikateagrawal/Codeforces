package div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Vlad_Building_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> o=new ArrayList<>();
            List<Integer> e=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                if(a[i]%2==0)e.add(a[i]);
                else o.add(a[i]);
            }
            if(e.size()==n||o.size()==n) System.out.println("YES");
            else{
                Collections.sort(o);
                Collections.sort(e);
                if(e.get(0)>o.get(0)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }

}
