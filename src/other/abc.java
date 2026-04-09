package other;


import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String ans="1";
            List<Integer> l=new ArrayList<>();
            l.add(sc.nextInt());
            boolean flag=false;
            for (int i=1;i<n;i++){
                int v=sc.nextInt();
                if(!flag){
                    if(v>=l.get(l.size()-1)){
                        l.add(v);
                        ans+="1";
                    }
                    else if(v<=l.get(0)){
                        l.add(v);
                        ans+="1";
                        flag=true;
                    }
                    else ans+="0";
                }
                else if(v>=l.get(l.size()-1) && v<=l.get(0)){
                    l.add(v);
                    ans+="1";
                }
                else ans+="0";
            }
            System.out.println(ans);
        }
    }
}
