package easy_800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Substring_Removal_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next()+"0";
            List<Integer> l=new ArrayList<>();
            int c=0;
            for (char ch:s.toCharArray()){
                if(ch=='1'){
                    c++;
                }
                else {
                    l.add(c);
                    c=0;
                }
            }
            Collections.sort(l,Collections.reverseOrder());
            int ans=0;
            for (int i=0;i<l.size();i+=2)ans+=l.get(i);
            System.out.println(ans);
        }
    }
}
