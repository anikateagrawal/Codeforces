package tcs_codevita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WareHouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sss=sc.nextLine().strip();
        if(sss.equals("")){
            System.out.println(0);return;
        }
        String s[]=sss.split(" ");
        ArrayList<Long> l=new ArrayList<>();
        for(String ss:s){
            l.add(Long.parseLong(ss));
        }
        long w=Long.parseLong( sc.nextLine());
        Collections.sort(l);
        int i=0,j=l.size()-1;
        int v=0;
        while (i<=j){
            v++;
            if(l.get(i)+l.get(j)<=w){
                i++;j--;
            }
            else j--;
        }
        System.out.print(v);
    }
}
