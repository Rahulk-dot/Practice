package collectionImplementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTest2 {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);

        System.out.println("All elements: "+qu);

        Queue<Integer> qu1 = new LinkedList<>();

        qu1.add(qu.poll());
        qu1.add(qu.poll());

        System.out.println("removed elements: "+qu1);
        System.out.println("remaining elements: "+qu);

    }
}
