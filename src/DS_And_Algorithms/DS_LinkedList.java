package DS_And_Algorithms;

import java.util.LinkedList;

public class DS_LinkedList {
    public static void main(String[] args) {

        /*LinkedList can be treated like Stack or Queue*/
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.pop();

        System.out.println(linkedList);
        System.out.println("----------");

        LinkedList<String> linkedList2 = new LinkedList<>();

        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("E");
        linkedList2.poll();

        System.out.println(linkedList2);
        System.out.println("----------");

        LinkedList<String> linkedList3 = new LinkedList<>();

        linkedList3.add("A");
        linkedList3.add("B");
        linkedList3.add("C");
        linkedList3.add("D");
        linkedList3.add("F");

        linkedList3.add(4,"E");
        linkedList3.remove("F");

        System.out.println(linkedList3.indexOf("B"));
        /*if the element does not persist indexOf returns -1*/

        System.out.println(linkedList3.peekFirst());
        System.out.println(linkedList3.peekLast());

        linkedList3.addFirst("0");
        linkedList3.addLast("F");

//        String first = linkedList3.removeFirst();
//        String last = linkedList3.removeLast();

        System.out.println(linkedList3);
    }
}
