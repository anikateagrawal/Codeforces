package easy_1000;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Preparing_for_the_Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[m];
            for (int i=0;i<m;i++)a[i]=sc.nextInt();

            Set<Integer> s=new HashSet<>();
            for (int i=0;i<k;i++)s.add(sc.nextInt());
            StringBuilder ans=new StringBuilder();
            for (int i=0;i<m;i++){
                if(k>=n)ans.append("1");
                else if(k<n-1)ans.append("0");
                else{
                    if(s.contains(a[i]))ans.append("0");
                    else ans.append("1");
                }
            }
            System.out.println(ans.toString());
        }
    }
}
