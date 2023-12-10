package meta_cup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sum_41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++){
            int p=sc.nextInt();
            int pr[]={2,3,5,7,11,13,17,19,23,29,31,37,41};
            List<Integer> ans =new ArrayList<>();
            int sum=0;
            for(int i:pr){
                while(p%i==0){
                    ans.add(i);
                    sum+=i;
                    p/=i;
                }
            }
            if(sum<41){
                while(sum<41){
                    ans.add(1);
                    sum++;
                }
            }
            if(p==1&&sum==41){
                System.out.print("Case #"+j+": "+ans.size());
                for(int i:ans) System.out.print(" "+i);
                System.out.println();
            }
            else System.out.println("Case #"+j+": -1");
        }
    }
}
