import java.util.stream.IntStream;

public class SortedSearch {
    public static int countNumbers(final int[] sortedArray, final int lessThan) {
        int left = 0, right = sortedArray.length - 1; 
        while (left <= right){
            int mid = (left + right) / 2;
            if (sortedArray[mid] < lessThan)
            left = mid + 1;
            else
            right = mid - 1;
        }
        return left;

        }



    public static void main(final String[] args) {
        System.out.println(SortedSearch.countNumbers(IntStream.rangeClosed(1, 100000).toArray(), 12));
    }
}