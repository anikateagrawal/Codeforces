package easy_900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sakurako_and_Water {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    int a=sc.nextInt();
                    if(a>=0)continue;
                    int d=i-j;
                    int b=m.getOrDefault(d,0);
                    m.put(d,Math.min(b,a));
                }
            }
            int sum=0;
            for (int k:m.keySet()){
                sum+=m.get(k);
            }
            System.out.println(-1*sum);
        }
    }
}
