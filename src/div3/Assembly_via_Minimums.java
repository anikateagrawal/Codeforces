package div3;

import java.util.*;

public class Assembly_via_Minimums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int bl=n*(n-1)/2;
            int b[]=new int[bl];
            for (int i = 0; i <bl ; i++) {
                b[i]=sc.nextInt();
            }
            TreeMap<Integer,Integer> m=new TreeMap<>();
            for(int i=0;i<bl;i++){
                m.put(b[i],m.getOrDefault(b[i],0)+1);
            }
            int l=n-1;
            List<Integer> ll=new ArrayList<>();
            for(int i:m.keySet()){
                if(m.get(i)==l){
                    ll.add(i);
                    l--;
                }
                else {
                    int it=m.get(i);
                    int x=l,p=0;
                    while (x>0&&it!=p){
                        p+=x;
                        ll.add(i);x--;
                    }
                    l=x;
                }
//                System.out.println(i);
            }
            for (int i:ll){
                System.out.print(i+" ");
            }
            int x=ll.size();
            while (x!=n){
                System.out.print(1000000000+" ");x++;
            }
            System.out.println();

        }
    }
}
