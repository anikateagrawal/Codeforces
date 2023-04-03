package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            int a=sc.nextInt();
            if(!s.contains(a))s.add(a);
        }
        System.out.println(4-s.size());
    }
}
