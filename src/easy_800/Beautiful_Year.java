package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;true;i++){
            String s=""+i;
            Set<Character> ss=new HashSet<>();
            for(int j=0;j<s.length();j++)ss.add(s.charAt(j));
            if(ss.size()==4){
                System.out.println(i);
                break;
            }
        }
    }
}
