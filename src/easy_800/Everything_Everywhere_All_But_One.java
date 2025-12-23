package easy_800;

import java.util.Scanner;

public class Everything_Everywhere_All_But_One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {
            int n=sc.nextInt();
            float[] dodo=new float[n];
            boolean w=false;


            for(int i=0;i<n;i++) {
                dodo[i]=sc.nextFloat();
            }
            for(int i=0;i<n;i++) {
                float sum=0;
                for(int j=0;j<n;j++) {
                    if(j==i)continue;
                    sum+=dodo[j];
                }
                if((sum/(n-1))==dodo[i]) {
                    System.out.println("Yes");
                    w=true;
                    break;
                }
            }
            if(!w) {
                System.out.println("No");
            }

        }
    }
}
