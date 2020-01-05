package datastructures.queues;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        // Create a queue of ____________.
        // I want you guys to create a LinkedList queue and a PriorityQueue queue.
        // Show the insertion, removal, and searching of each queue.

        // Look at the java api documentation for each class (if you're not sure what
        // methods to call, or how to instantiate a queue)

        LinkedList<Integer> ticketNumberQueue = new LinkedList<>();
        ticketNumberQueue.add(93823);
        ticketNumberQueue.add(39281);
        ticketNumberQueue.add(72611);
        ticketNumberQueue.add(76621);

        int firstTicketNum = ticketNumberQueue.peekFirst();
        System.out.println(firstTicketNum); // 93823

        // remove first element in queue
        ticketNumberQueue.poll();

        firstTicketNum = ticketNumberQueue.peekFirst();
        System.out.println(firstTicketNum); // 39281

        // Alphabets
        PriorityQueue<Character> alphabetQueue = new PriorityQueue<>();
        alphabetQueue.add('B');
        alphabetQueue.add('U');
        alphabetQueue.add('C');
        alphabetQueue.add('K');
        alphabetQueue.add('S');

        //alphabetQueue.poll();
//        char firstElement = alphabetQueue.peek();
//        System.out.println("First Element " + firstElement);

        while (!alphabetQueue.isEmpty()) {
            System.out.println(alphabetQueue.poll());
        }
    }
}
