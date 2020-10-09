import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
       HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
       int[] ans = new int[2];
       for (int i = 0; i < list.length; i++)
           if (hMap.containsKey(sum - list[i])){
                ans[0] = i;
                ans[1] = hMap.get(sum - list[i]);
                return ans;
           }
           else
            hMap.put(list[i], i);
        return null;
       }

    

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("h");
        list.add("f");
        list.add("s");
        Deque<String> deque = new LinkedList<String>();
        // for ( java.util.Iterator<String> it = list.iterator(); it.hasNext();){
        //     String val = it.next();
        //     System.out.println(val);
        //     if (val.equals("h"))
        //         list.add("u");
        // }
        deque.add("Element 1 (Tail)"); 
        while(!deque.isEmpty()){
            System.out.println(deque.removeFirst());
            deque.offer("Element 5 (Tail)"); 
        }
        if(indices != null) {
             
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
