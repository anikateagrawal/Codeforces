package medium_1400;

import java.util.Arrays;
import java.util.Scanner;

public class Karen_and_Coffee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int tmp[]=new int[200002];
        for (int i=0;i<n;i++){
            tmp[sc.nextInt()]++;
            tmp[sc.nextInt()+1]--;
        }
//        System.out.println(Arrays.toString(tmp));
        for (int i=1;i<tmp.length;i++){
            tmp[i]+=tmp[i-1];
        }
//        System.out.println(Arrays.toString(tmp));
        for (int i=0;i<tmp.length;i++){
            if(tmp[i]>=k)tmp[i]=1;
            else tmp[i]=0;
        }
//        System.out.println(Arrays.toString(tmp));
        for (int i=1;i<tmp.length;i++){
            tmp[i]+=tmp[i-1];
        }
        for (int i=0;i<q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(tmp[b]-tmp[a-1]);
        }
    }
}
