package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Difficult_Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            StringBuilder ss=new StringBuilder(new String(arr));
            ss.reverse();
            System.out.println(ss.toString());
        }
    }
}
