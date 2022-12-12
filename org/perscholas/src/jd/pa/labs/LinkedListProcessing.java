/*
    LAB - 303.8.1  - LinkedList Processing
    In this lab, we will explore and demonstrate LinkedList using built-in methods.
 */

package org.perscholas.src.jd.pa.labs;

import java.util.*;



public class LinkedListProcessing {
    public static void main(String args[]) {


        //LinkedListExample();
        //LinkedListSort();
    }


    public static void LinkedListExample() {
        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + linkedlist);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);

        /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " + firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);


        System.out.println("First element after update by set method: " + firstvar2);


        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedlist);

        /* Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " + linkedlist);
    }

    public static void LinkedListSort() {
        /*
            Example two: How to Sort LinkedList
            In this example, we will demonstrate how to sort a LinkedList using the Collections.sort() method.
            Please note that for custom sorting of objects, we can use Collections.sort(linkedList, comparator) method.
         */

        //Create linked list

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        // Unsorted
        System.out.println(linkedList);

        // 1. Sort the list
        Collections.sort(linkedList);

        // Sorted
        System.out.println(linkedList);

        // 2. Custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());

        // Custom sorted
        System.out.println(linkedList);
    }
}


