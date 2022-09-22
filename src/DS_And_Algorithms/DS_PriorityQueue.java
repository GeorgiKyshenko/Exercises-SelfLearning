package DS_And_Algorithms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DS_PriorityQueue {
    public static void main(String[] args) {

        /*FIFO data structure that serves elements with the highest priorities first
        * before elements with lower priority*/

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        /*We can use in the constructor Collections.reversOrder()*/

        queue.offer(2.3);
        queue.offer(1.2);
        queue.offer(3.7);
        queue.offer(5.2);
        queue.offer(0.2);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("********");

        Queue<String> queue1 = new PriorityQueue<>();
        /* PriorityQueue compare strings lexicographically !*/

        queue1.offer("XR");
        queue1.offer("XX");
        queue1.offer("X");
        queue1.offer("FZ");
        queue1.offer("A");
        queue1.offer("B");

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }



    }
}
