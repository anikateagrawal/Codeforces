package other;

import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            boolean fl=false;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]==67)fl=true;
            }
            System.out.println(fl?"YES":"NO");
        }
    }

}
