import java.util.*;  

class HashMapp {
    public static void main(String[] args) {
        
        HashMap<Boolean, String> map = new HashMap<Boolean, String>();
        map.put(true,"Poojan");
        map.put(false,"Darshan");
        System.out.println(map);
        
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        
        map1.put(99,"Ashwin");
        map1.put(18,"Kohli");
        map1.put(99,"ASH");
        
       map1.forEach((k,v)->System.out.println(k+" :"+v));
        
    }
}
