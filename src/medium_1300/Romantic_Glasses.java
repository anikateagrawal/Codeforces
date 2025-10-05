package medium_1300;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Romantic_Glasses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            long odd=0,even=0;
            Map<Long,Integer> m=new HashMap<>();
            boolean flag=false;
            m.put(0L,-1);
            for (int i=0;i<n;i++){
                if(i%2==0)even+=a[i];
                else odd+=a[i];
                long d=even-odd;
                if(m.containsKey(d)){
                    flag=true;
                    break;
                }
                m.put(d,i);
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
