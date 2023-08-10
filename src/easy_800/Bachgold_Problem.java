package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bachgold_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        if(n%2==1) {
            ans.add(3);
            n-=3;
        }
        while(n>1){
            ans.add(2);
            n-=2;
        }
        System.out.println(ans.size());
        for (int i:ans) System.out.print(i+" ");
    }
}
