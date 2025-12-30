package easy_800;

import java.util.*;

public class Meaning_Mean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            PriorityQueue<Integer> nums=new PriorityQueue<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                nums.add(a[i]);
            }
            while (nums.size()>1){
                nums.add((nums.poll()+nums.poll())/2);
            }
            System.out.println(nums.poll());
        }
    }
}
