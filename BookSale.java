import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
public class BookSale {
 
    public static void main(String[] args) {
         
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        int n = 4;
        int nthRarestElement = nthLowestSelling(arr, n);
        System.out.println("" + n + "th rarest Element: " + nthRarestElement);
 
    }
     
    private static int nthLowestSelling(int[] array, int nth) {

         
        Map<Integer, Long> map = Arrays.stream(array).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Comparator<Map.Entry<Integer, Long>> comp = Comparator.comparing(entry -> entry.getValue());
        List<Map.Entry<Integer, Long>> list = new ArrayList<>(map.entrySet());
        list.sort(comp);
        if (nth > list.size() - 1) throw new IllegalArgumentException("no such element");
        return list.get(nth).getKey();
    }
}