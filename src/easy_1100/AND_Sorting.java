package easy_1100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AND_Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]!=i)l.add(a[i]);
            }
            int ans=0;
            for (int i=0;i<32;i++){
                boolean fl=true;
                for (int j:l){
                    if ((j&(1<<i))==0){
                        fl=false;
                        break;
                    }
                }
                if (fl)ans|=1<<i;
            }
            System.out.println(ans);
        }
    }
}
