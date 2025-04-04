package medium_1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Drazil_and_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        List<Integer> ans=new ArrayList<>();
        for (char ch:s.toCharArray()){
            int d=ch-'0';
            add(d,ans);
        }
        Collections.sort(ans,Collections.reverseOrder());
        for (int d:ans) System.out.print(d);
        System.out.println();
    }
    static void add(int n, List<Integer> num){
        if (n==9){
            num.add(3);
            num.add(3);
            num.add(2);
            num.add(7);
        }
        if(n==8){
            num.add(2);
            num.add(2);
            num.add(2);
            n--;
        }
        if (n==7){
            num.add(7);
        }
        if (n==6){
            num.add(3);
            n--;
        }
        if (n==5){
            num.add(5);
        }
        if(n==4){
            num.add(2);
            num.add(2);
            n--;
        }
        if(n==3){
            num.add(3);
        }
        if(n==2){
            num.add(2);
        }
    }
}
