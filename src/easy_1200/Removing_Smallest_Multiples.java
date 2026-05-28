package easy_1200;

import java.util.*;

public class Removing_Smallest_Multiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            char a[]=sc.next().toCharArray();
            HashSet<Integer> st=new HashSet<>();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++)if (a[i]=='0'){
                st.add(i+1);
                l.add(i+1);
            }
            long ans=0;
            outer:
            for (int i:l){
                for (int j=1;j*i<=n;j++){
                    int m=j*i;
                    if (a[m-1]=='1')break ;
                    if (st.contains(m)){
                        ans+=i;
                        st.remove(m);
                    }
                    if (st.size()==0)break outer;
                }
            }
            System.out.println(ans);
        }
    }
}
