package easy_1000;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Not_a_Cheap_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int p=sc.nextInt();
            PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
            int sum=0;
            for (int i=0;i<s.length();i++){
                pq.add(new int[]{s.charAt(i)-'a'+1,i});
                sum+=s.charAt(i)-'a'+1;
            }
            char a[]=s.toCharArray();
            while (sum>p){
                int r[]=pq.poll();
                sum-=r[0];
                a[r[1]]=' ';
            }
            String ans=new String(a);
            System.out.println(ans.replace(" ",""));
        }
    }
}
