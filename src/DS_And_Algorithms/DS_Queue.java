package DS_And_Algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class DS_Queue {
    public static void main(String[] args) {


        /*First In - First Out. Its linear data structure.
        Queue is an interface, so we cannot create a new instance of Queue,
        we need a class which implements Queue */
        Queue<String> queue = new LinkedList<>();

        //adding and elements
        queue.offer("Book1");
        queue.offer("Book2");
        queue.offer("Book3");

        System.out.println(queue);

        //removing elements
        queue.poll();
        queue.poll();
        System.out.println(queue);

        //few methods
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Book3"));
    }
}
