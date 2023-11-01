package easy_800;

import java.util.Scanner;

public class File_Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        while(s.contains("xxx"))
            s=s.replace("xxx","xx");
        System.out.println(n-s.length());
    }
}
