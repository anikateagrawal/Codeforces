package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tom_Riddle_s_Diary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String> s=new HashSet<>();
        for (int i=0;i<n;i++){
            String ss=sc.next();
            if(s.contains(ss)) System.out.println("YES");
            else {
                System.out.println("NO");
                s.add(ss);
            }
        }
    }
}
