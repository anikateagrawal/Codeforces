package easy_1000;

import java.util.*;

public class Different_Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> prime=prime();
        int t=sc.nextInt();
        while (t-->0){
            int d=sc.nextInt();
            int a= Collections.binarySearch(prime,1+d);
            if(a<0)a=-(a+1);
            int b=Collections.binarySearch(prime,prime.get(a)+d);
            if(b<0)b=-(b+1);
            System.out.println(prime.get(a)*prime.get(b));
        }
    }
    static List<Integer> prime(){
        int a[]=new int[10000000];
        a[0]=1;a[1]=1;
        List<Integer> prime=new ArrayList<>();
        for (int i=2;i<a.length;i++){
            if(a[i]==0){
                for (int j=2;j*i<a.length;j++){
                    a[j*i]=1;
                }
                prime.add(i);
            }
        }
        return prime;
    }
}
