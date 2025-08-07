 import java.lang.reflect.Array;
import java.util.*;
public class cwh_11_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
     
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(9);
        L1.add(0,5);
        L1.add(0,1);

       
        // L1.clear();
        System.out.println(L1.contains(27));
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }

    }
    
}
