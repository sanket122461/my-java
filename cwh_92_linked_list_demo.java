import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_linked_list_demo {
    public static void main(String[] args) {
          LinkedList<Integer> L1 = new LinkedList<>();
     
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(9);
        L1.add(0,5);
        L1.add(0,1);
        L1.addFirst(12); 
        L1.addLast(10);

       
        // L1.clear();
        System.out.println(L1.contains(27));
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
         
    }
    
}
