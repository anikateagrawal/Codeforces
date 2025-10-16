package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hayato_and_School {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            List<Integer> odd=new ArrayList<>();
            List<Integer> even=new ArrayList<>();
            for (int i=0;i<n;i++){
                if(a[i]%2==0)even.add(i+1);
                else odd.add(i+1);
            }
            if(odd.size()>=3){
                System.out.println("YES");
                System.out.println(odd.get(0)+" "+odd.get(1)+" "+odd.get(2));
            }
            else if(odd.size()>=1 && even.size()>=2){
                System.out.println("YES");
                System.out.println(odd.get(0)+" "+even.get(0)+" "+even.get(1));
            }
            else System.out.println("NO");
        }
    }
}
