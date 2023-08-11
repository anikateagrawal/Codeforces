package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Panoramix_s_Prediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer p[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(Arrays.asList(p).indexOf(n)+1==Arrays.asList(p).indexOf(m)) System.out.println("YES");
        else System.out.println("NO");
    }
}
