import java.util.*;
/*
7
2
3
World
Asia
Africa
India
China
South_Africa
Egypt

 */
class TestClass {
    static int m=0;
    static Integer lock[];
    static Map<String,Integer> nodeIndex;
    static int desLocked[];
    static List<List<Integer>> lockDes;
    static List<String> l;
    static int flag[];
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        m=sc.nextInt();
        int q=sc.nextInt();
        l=new ArrayList<>();
        nodeIndex=new HashMap<>();
        for(int i=0;i<n;i++){
            l.add(sc.next());
            nodeIndex.put(l.get(i),i);
        }
        lock=new Integer[n];
        desLocked=new int[n];
        flag=new int[n];
        Arrays.fill(flag,1);
        lockDes=new ArrayList<>();
        for(int i=0;i<n;i++)lockDes.add(new ArrayList<>());
//        for(int i=0;i<q;i++){
//            int t=sc.nextInt();
//            String name=sc.next();
//            int uid=sc.nextInt();
//            boolean res=false;
//            if(!nodeIndex.containsKey(name)){
//                System.out.println(false);
//                continue;
//            }
//            switch(t){
//                case 1:res=lock(name,uid);break;
//                case 2:res=unlock(name,uid);break;
//                case 3:res=upgrade(name,uid);break;
//            }
//            System.out.println(res);
//        }
        Thread ancestor=new Thread(()-> System.out.println(lock("Asia",1)+" ancestor"));
        Thread descendant=new Thread(()-> System.out.println(lock("India",2)+" descendant"));
        Thread sibling =new Thread(()-> System.out.println(lock("China",3)+" sibling"));
        descendant.start();
        sibling.start();
        ancestor.start();
    }


    static boolean lock(String name,int uid) {
        int idx = nodeIndex.get(name);
        int f = flag[idx]--;
        if (f != 1) {
            flag[idx]++;
            return false;
        }
        if(desLocked[idx]>0||lock[idx]!=null||!checkAnc((idx-1)/m,idx)){
            flag[idx]++;
            return false;
        }
        lock[idx]=uid;
        flag[idx]++;
        return true;
    }

    static boolean checkAnc(int i,int idx){
        desLocked[i]++;
        if(lock[i]!=null||flag[i]!=1){
            desLocked[i]--;
            return false;
        }
        if(i==0)return true;
        boolean f=checkAnc((i-1)/m,idx);
        if(!f)desLocked[i]--;
        if(f)lockDes.get(i).add(idx);
        return f;
    }
    static boolean unlock(String name,int uid){
        int idx=nodeIndex.get(name);
        if(lock[idx]!=null&&lock[idx]==uid){
            updateAnc2((idx-1)/m,idx);
            lock[idx]=null;
            return true;
        }
        return false;
    }

    static void updateAnc2(int i,int idx){
        desLocked[i]--;
        lockDes.get(i).remove((Integer)idx);
        if(i==0)return;
        updateAnc2((i-1)/m,idx);
    }

    static boolean upgrade(String name,int uid){
        int idx=nodeIndex.get(name);
        if(lock[idx]!=null)return false;
        List<Integer> des=lockDes.get(idx);
        if(des.size()==0)return false;
        for(int i:des){
            if(lock[i]!=uid)return false;
        }
        for(int i:des)unlock(l.get(i),uid);
        lock(name,uid);
        return true;
    }
}
