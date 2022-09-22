package DS_And_Algorithms;

import java.util.Stack;

public class DS_Stack {
    public static void main(String[] args) {

        // Last In-First Out
        Stack<String> stack = new Stack<>();

        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
//        System.out.println(stack.empty());
        System.out.println(stack);

        /* stack.search(); - returns integer started from 1 (exm:"Book3" returns 1)
         (exm: "Book2" returns 2).
         If object does not exist in the stack, stack.search(); returns -1 */
        System.out.println(stack.search("Book3"));

        //stack.pop(); - remove the last added element
        stack.pop();
        stack.pop();
        System.out.println(stack);

        // stack.peek(); - does not remove elements
        String book = stack.peek();
        System.out.println(book);
        System.out.println(stack);


    }
}
