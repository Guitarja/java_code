import java.io.*;
import java.util.*;


class LinkedList { 
    static Node head; // head of list 
    //Node dummy = head;
    /* Linked list Node.  This inner class is made static so that */
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } // Constructor 

        public void append(int value) {
            // TODO - implement recursively
            if(next == null) {
                next = new Node(value);
            } else {
                next.append(value);
            }
        }
    }


    public void appendToEnd(int value) {
        // TODO - implement using Node's append method\
        if(head == null) {
            head = new Node(value);
        } else {
            head.append(value);
        }
    }

	public void printList() {
        // TODO - implement 
        Node running = head;
        while (running != null) {
            System.out.print(running.data +" ");
            running = running.next;
        }
        // while (dummy.next != null)
        //     System.out.println(dummy.next.data);
    }

    // public LinkedList reverse() {
    // 	// TODO - implement
    // }

} 

public class LLOmronTest {
    public static void main(String[] args) { 
        LinkedList llist = new LinkedList();

        llist.appendToEnd(1);
        llist.appendToEnd(2);
        llist.appendToEnd(3);
        llist.printList();
        /*  Now next of the second Node refers to third.  So all three 
            nodes are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ 
		
		Usage:
		llist.appendToEnd(1)
		llist.appendToEnd(2)
		llist.appendToEnd(3)

		llist.printList() // 1 2 3

		llist.reverse()

		llist.printList() // 3 2 1




        */


      
    } 

}
