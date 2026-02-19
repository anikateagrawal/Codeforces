package easy_1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Destruction_of_the_Dandelion_Fields {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> e=new ArrayList<>();
            List<Integer> o=new ArrayList<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a%2==0)e.add(a);
                else o.add(a);
            }
            if (o.size()==0) System.out.println(0);
            else {
                long s=0;
                for (int i:e)s+=i;

                Collections.sort(o,(i1,i2)->i2-i1);
                for (int i=0;i<=(o.size()-1)/2;i++)s+=o.get(i);
                System.out.println(s);
            }
        }
    }
}
