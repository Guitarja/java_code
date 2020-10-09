
// Java program to demonstrate working of PriorityQueue 
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;
class ValueThenKeyComparator<K extends Comparable<? super K>,
                                    V extends Comparable<? super V>>
    implements Comparator<Map.Entry<K, V>> {

    public int compare(Map.Entry<K, V> a, Map.Entry<K, V> b) {
        int cmp1 = a.getKey().compareTo(b.getKey());
        if (cmp1 != 0) {
            return cmp1;
        } else {
            return a.getValue().compareTo(b.getValue());
        }
    }

}
public class PriorityQueueMap {

    // Driver code
    public static void main(String args[]) {
        // Creating empty priority queue
        PriorityQueue<Map.Entry<Integer, String>> pQueue = new PriorityQueue<>(new ValueThenKeyComparator<>());

        // Adding items to the pQueue using add()
        pQueue.add(Map.entry(1, "bb"));
        pQueue.add(Map.entry(1, "aa"));
        pQueue.add(Map.entry(1, "cc"));
        pQueue.add(Map.entry(3, "aa"));

        // Printing the most priority element
        System.out.println("Head value using peek function:" + pQueue.peek());

        // Printing all elements
        System.out.println("The queue elements:");
        Iterator<Entry<Integer, String>> itr = pQueue.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next()); 

		// Removing the top priority element (or head) and 
		// printing the modified pQueue using poll() 
		pQueue.poll(); 
		System.out.println("After removing an element "
						+ "with poll function:"); 
		Iterator<Entry<Integer, String>> itr2 = pQueue.iterator();
		while (itr2.hasNext()) 
			System.out.println(itr2.next()); 

		// Removing 30 using remove() 
		pQueue.remove(Map.entry(1, "aa")); 
		System.out.println("after removing 30 with"
						+ " remove function:"); 
		Iterator<Entry<Integer, String>> itr3 = pQueue.iterator();
		while (itr3.hasNext()) 
			System.out.println(itr3.next()); 

		// Check if an element is present using contains() 
		boolean b = pQueue.contains(Map.entry(1, "aa")); 
		System.out.println("Priority queue contains 20 "
						+ "or not?: " + b); 

		// Getting objects from the queue using toArray() 
		// in an array and print the array 
		Object[] arr = pQueue.toArray(); 
		System.out.println("Value in array: "); 
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Value: " + arr[i].toString()); 
	} 
} 
