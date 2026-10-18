package easy_900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Radio_Station {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Map<String ,String > map=new HashMap<>();
        for (int i=0;i<n;i++){
            String name=sc.next();
            String ip=sc.next()+";";
            map.put(ip,name);
        }
        for (int i=0;i<m;i++){
            String c=sc.next();
            String ip=sc.next();
            c+=" "+ip+" #"+map.get(ip);
            System.out.println(c);
        }
    }
}
