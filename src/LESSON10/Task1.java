package LESSON10;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>(List.of(2, 23, 34, 2, 34, 90, 1, 32, 8, 34, 2, 34, 8, 11));
        Map<Integer ,Integer> map = new HashMap<>();

        for(  Integer x  : mass) {
            if(  map.containsKey(x)   ) {
                map.put(x, map.get(x) + 1);
            }
            else {
                map.put(x, 1);
            }
        }

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            Object val = map.get(key);
            if (val.equals(1)) {
                it.remove();
            }
        }

        System.out.println(map);
    }
}
