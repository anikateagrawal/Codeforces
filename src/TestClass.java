import java.util.*;

class TestClass {
    static int m=0;
    static Integer lock[];
    static Map<String,Integer> nodeIndex;
    static int desLocked[];
    static List<List<Integer>> lockDes;
    static List<String> l;
    static int flag=1;
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
        for(int i=0;i<n;i++)lockDes.add(new ArrayList<>());
        for(int i=0;i<q;i++){
            int t=sc.nextInt();
            String name=sc.next();
            int uid=sc.nextInt();
            boolean res=false;
            if(!nodeIndex.containsKey(name)){
                System.out.println(false);
                continue;
            }
            switch(t){
                case 1:res=lock(name,uid);break;
                case 2:res=unlock(name,uid);break;
                case 3:res=upgrade(name,uid);break;
            }
            System.out.println(res);
        }
    }


    static boolean lock(String name,int uid){
        int f=flag--;
        if(f!=0){
            return false;
        }
        int idx=nodeIndex.get(name);
        if(desLocked[idx]==0&&checkAnc(idx))
        {
            lock[idx]=uid;
            return true;
        }
        updateAnc((idx-1)/m,idx);
        flag=1;
        return false;
    }
    static void updateAnc(int i,int idx){
        desLocked[i]++;
        lockDes.get(i).add(idx);
        if(i==0)return;
        updateAnc((i-1)/m,idx);
    }
    //    static boolean checkDesc(int i){
//        if(i>=l.size())return true;
//        if(lock[i]!=null)return false;
//        for(int j=1;j<=m;j++){
//            if(!checkDesc(i*m+j))return false;
//        }
//        return true;
//    }
    static boolean checkAnc(int i){
        if(i<0)return true;
        if(lock[i]!=null)return false;
        if(i==0)return true;
        return checkAnc((i-1)/m);
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
        updateAnc((i-1)/m,idx);
    }
    static boolean hasLocDes;
    static boolean upgrade(String name,int uid){
        int idx=nodeIndex.get(name);
        if(lock[idx]!=null)return false;
//        hasLocDes=false;
//        for(int j=1;j<=m;j++){
//            if(!allLocByU(idx*m+j,uid))return false;
//        }
//        if(!hasLocDes)return false;
        List<Integer> des=lockDes.get(idx);
        if(des.size()==0)return false;
        for(int i:des){
            if(lock[i]!=uid)return false;
        }
        for(int i:des)unlock(l.get(i),uid);

//        unlockAllDes(idx,uid);
        lock(name,uid);
        return true;
    }
//    static void unlockAllDes(int i,int uid){
//        if(i>=l.size())return;
//        unlock(l.get(i),uid);
//        for(int j=1;j<=m;j++){
//            unlockAllDes(i*m+j,uid);
//        }
//    }
//    static boolean allLocByU(int i,int uid){
//        if(i>=l.size())return true;
//        if(lock[i]!=null&&lock[i]!=uid)return false;
//        if(lock[i]!=null&&lock[i]==uid)hasLocDes=true;
//        for(int j=1;j<=m;j++){
//            if(!allLocByU(i*m+j,uid))return false;
//        }
//        return true;
//    }
}
