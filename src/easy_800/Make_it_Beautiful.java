package easy_800;

import java.util.*;

public class Make_it_Beautiful {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Integer a[]=new Integer[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a, Collections.reverseOrder());
            if(allEqual(a)){
                System.out.println("NO");
            }
            else {
                int tmp=a[n-1];
                a[n-1]=a[1];
                a[1]=tmp;
                System.out.println("YES");
                for (int i:a) System.out.print(i+" ");
                System.out.println();
            }
        }
    }
    static boolean allEqual(Integer a[]){
        for (int i=1;i<a.length;i++){
            if(a[i]!=a[0])return false;
        }
        return true;
    }
}
