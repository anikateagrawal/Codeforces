package medium_1300;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Divide_and_Equalize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                int p=2;
                while (a[i]%p==0){
                    map.put(p,map.getOrDefault(p,0)+1);
                    a[i]/=p;
                }
                for (p=3;p<=Math.sqrt(a[i]);p+=2){
                    while (a[i]%p==0){
                        map.put(p,map.getOrDefault(p,0)+1);
                        a[i]/=p;
                    }
                    if(a[i]==1)break;
                }
                if(a[i]>2)map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
            boolean flag=true;
            for (int f:map.keySet()){
                if(map.get(f)%n!=0){
                    flag=false;
                    break;
                }
            }
//            System.out.println(map);
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
