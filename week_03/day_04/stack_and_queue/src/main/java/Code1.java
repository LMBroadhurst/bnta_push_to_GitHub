import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code1 {

    public class Main {
        public static void main(String[] args) {
        /*
            Let's create an object of the type LinkedList and
            assign it to 3 reference variables of type: LinkedList, List, Queue.
            Depending on the reference variable's type, we get different methods to choose from.

        */

            LinkedList<String> allMethodsAvailable = new LinkedList<>();
//            Initialising an Object of type, LinkedList (Concrete Type)
//            The variable is of the type LinkedList

            List<String> listMethodsOnly = allMethodsAvailable;
//            Here we are assigning the reference variable with a Type of List instead.

            Queue<String> queueMethodsOnly = allMethodsAvailable;
//            Here we are assigning the reference variable with a Type of Queue instead.

        /*
            Use the dot test to check what methods are available e.g.
            listMethodsOnly. <- intelliJ shows you the available methods
         */

        /*
            When we use a queue interface, we can use queue methods only.
            Let's look at the poll() and peek() methods and how they differ.
         */

            Queue<String> queue = new LinkedList<>();
            queue.add("First");
            queue.add("Second");
            queue.add("Third");

            System.out.println(queue);

        /*
            From javadoc:
            Retrieves, but does not remove,
            the head of this queue,
            or returns null if this queue is empty.
         */
            String peek = queue.peek();
            System.out.println(peek);
            System.out.println("The queue after peek()");
            System.out.println(queue);

        /*
            From javadoc:
            Retrieves and removes the head of this queue,
            or returns null if this queue is empty.
         */
            String poll = queue.poll();
            System.out.println(poll);

            System.out.println("The queue after poll()");
            System.out.println(queue);

        }
    }

}
