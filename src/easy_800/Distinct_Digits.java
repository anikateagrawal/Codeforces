package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distinct_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int ans=-1;
        for (int i=l;i<=r;i++){
            if(isDistinct(i)){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
    static boolean isDistinct(int n){
        String s=""+n;
        Set<Character> st=new HashSet<>();
        for ( char ch:s.toCharArray()){
            st.add(ch);
        }
        return st.size()==s.length();
    }
}
