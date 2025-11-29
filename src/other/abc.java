package other;
import java.util.Scanner;
import java.util.TreeMap;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            int t=sc.nextInt();
            int d=c*t;
            int end=s+d;
            s=end;
            map.put(end,i+1);
        }
        for (int i=0;i<m;i++){
            int mom=sc.nextInt();
            int ceil=map.ceilingKey(mom);
            System.out.println(map.get(ceil));
        }
    }
}