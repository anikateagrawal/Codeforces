package contests;

import java.util.*;

public class Dual_Easy_Version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            List<int []> ans=new ArrayList<>();
            if(in(Arrays.copyOf(a,a.length),ans)){
                System.out.println(ans.size());
                for(int i[]:ans) System.out.println(i[0]+1+" "+(i[1]+1));
            }
            else{
                ans=new ArrayList<>();
                dec(Arrays.copyOf(a,a.length),ans);
                System.out.println(ans.size());
                for (int i[]:ans) System.out.println(i[0]+1+" "+(i[1]+1));
            }
        }
    }
    public static boolean in(int a[],List<int[]> ans){
        PriorityQueue<int[]> q=new PriorityQueue<>((i1,i2)->i2[0]-i1[0]);
        for(int i=0;i<a.length;i++)q.add(new int[]{a[i],i});
        for(int i=0;i<a.length-1;i++){
            while(a[i]>a[i+1]){
                a[i+1]+=q.peek()[0];
                ans.add(new int[]{i+1,q.peek()[1]});
                if(ans.size()>50)return false;
            }
            q.add(new int[]{a[i+1],i+1});
        }
        return true;
    }
    public static boolean dec(int a[],List<int[]> ans){
        PriorityQueue<int[]> q=new PriorityQueue<>((i1,i2)->i1[0]-i2[0]);
        for(int i=0;i<a.length;i++)q.add(new int[]{a[i],i});
        for(int i=a.length-1;i>0;i--){
            while(a[i-1]>a[i]){
                a[i-1]+=q.peek()[0];
                ans.add(new int[]{i-1,q.peek()[1]});
                if(ans.size()>50)return false;
            }
            q.add(new int[]{a[i-1],i-1});
        }
        return true;
    }
}
