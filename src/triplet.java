import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int d=sc.nextInt();
        int p=0;
        for (int i = 0; i < n; i++) {
            int r=a[i]%d;
            Map<Integer,Integer> m=new HashMap<>();
            for(int j=i+1;j<n;j++){
                int r2=(a[j]%d+r)%d;
                int rm=(d-r2)%d;
                if(m.containsKey(rm)){
                    p+=m.get(rm);
                }
                m.put(a[j]%d,m.getOrDefault(a[j]%d,0)+1);
            }
        }
        System.out.println(p);
    }
}
