package easy_1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class New_Year_Transportation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        List<List<Integer>> m=new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            m.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            int a=sc.nextInt();
            m.get(i).add(i+a);
        }
        if(dfs(m,1,t)) System.out.println("YES");
        else System.out.println("NO");
    }
    static boolean dfs(List<List<Integer>> m,int src,int des){
        if(src==des)return true;
        for(int nb:m.get(src)){
            if(dfs(m,nb,des))return true;
        }
        return false;
    }
}
