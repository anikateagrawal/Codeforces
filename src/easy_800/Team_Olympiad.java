package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team_Olympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int in=sc.nextInt();
            if(in==1)a.add(i);
            else if(in==2)b.add(i);
            else c.add(i);
        }
        int min=Math.min(a.size(),Math.min(b.size(),c.size()));
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            System.out.println(a.get(i)+" "+b.get(i)+" "+c.get(i));
        }
    }
}
