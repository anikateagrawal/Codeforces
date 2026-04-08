package easy_1000;

import java.util.ArrayList;
import java.util.Scanner;

public class Keep_it_Beautiful {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            StringBuilder ans=new StringBuilder("1");
            ArrayList<Integer> a=new ArrayList<>();
            a.add(sc.nextInt());
            boolean flag=false;
            for (int i=1;i<n;i++){
                int v=sc.nextInt();
                if (!flag){
                    if (v>=a.get(a.size()-1)){
                        ans.append("1");
                        a.add(v);
                    }
                    else if(v<=a.get(0)){
                        ans.append("1");
                        a.add(v);
                        flag=true;
                    }
                    else ans.append("0");
                }
                else {
                    if(v>=a.get(a.size()-1) && v<=a.get(0)){
                        ans.append("1");
                        a.add(v);
                    }
                    else ans.append("0");
                }
            }
            System.out.println(ans);
        }
    }
}
