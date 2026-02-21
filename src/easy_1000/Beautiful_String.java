package easy_1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beautiful_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            List<Integer> ans=new ArrayList<>();
            for (int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='0')ans.add(i+1);
            }
            System.out.println(ans.size());
            for (int i:ans) System.out.print(i+" ");
            System.out.println();
        }
    }
}
