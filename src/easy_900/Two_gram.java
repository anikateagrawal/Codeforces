package easy_900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_gram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> m=new HashMap<>();
        int n=sc.nextInt();
        String s=sc.next();
        for(int i=0;i<n-1;i++){
            String two_gram=s.substring(i,i+2);
            m.put(two_gram,m.getOrDefault(two_gram,0)+1);
        }
        int max=0;
        String max_two_gram="";
        for (String k:m.keySet()){
            if(m.get(k)>max){
                max=m.get(k);
                max_two_gram=k;
            }
        }
        System.out.println(max_two_gram);
    }
}
