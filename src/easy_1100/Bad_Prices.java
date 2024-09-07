package easy_1100;

import java.util.Scanner;
import java.util.Stack;

public class Bad_Prices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Stack<Integer> s=new Stack<>();
            int count=0;
            for (int i=n-1;i>=0;i--){
                while (!s.isEmpty() && s.peek()>=a[i])s.pop();
                if(!s.isEmpty())count++;
                s.push(a[i]);
            }
            System.out.println(count);
        }
    }
}
