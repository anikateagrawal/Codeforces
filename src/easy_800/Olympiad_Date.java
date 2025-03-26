package easy_800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Olympiad_Date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> a= new ArrayList<>(Arrays.asList(0,1,0,3,2,0,2,5));
            int ans=0;
            for (int i=0;i<n;i++){
                Integer d=sc.nextInt();
                a.remove(d);
                if(a.size()==0 && ans==0){
                    ans=i+1;
                }
            }
            System.out.println(ans);
        }
    }
}
