package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            Set<Character> st=new HashSet<>();
            for(int i=0;i<n;i++){
                if(st.contains(a[i])){
                    System.out.println("NO");
                    continue outer;
                }
                st.add(a[i]);
                int j=i+1;
                while(j<n&&a[j]==a[i]){
                    j++;
                }
                if(j>i+1)i=j-1;
            }
            System.out.println("YES");
        }
    }
}
