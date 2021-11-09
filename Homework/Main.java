public class Main {

    public static void main(String[] args) {

        PriorityQueue<String> priorityQueueOne = new PriorityQueue<String>();

      System.out.println(priorityQueueOne.isEmpty());

        priorityQueueOne.add(2, "Bob1");
        priorityQueueOne.printList();
        System.out.println(" 1 ");

        priorityQueueOne.add(1, "Bab1");
        priorityQueueOne.printList();
        System.out.println(" 2 ");

        priorityQueueOne.add(1, "Bob2");
        priorityQueueOne.printList();
        System.out.println(" 3 ");

        priorityQueueOne.add(1, "Bob3");
        priorityQueueOne.printList();
        System.out.println(" 4 ");

        priorityQueueOne.add(1, "Bab2");
        priorityQueueOne.printList();
        System.out.println(" 5 ");

        priorityQueueOne.add(2, "Tim1");
        priorityQueueOne.printList();
        System.out.println(" 6 ");

        priorityQueueOne.add(3, "John1");
        priorityQueueOne.printList();
        System.out.println(" 7 ");

        priorityQueueOne.add(2, "Tom1");
        priorityQueueOne.printList();
        System.out.println(" 8 ");

        priorityQueueOne.add(2, "Tim2");
        priorityQueueOne.printList();
        System.out.println(" 9 ");

        priorityQueueOne.add(4, "Eric1");
        priorityQueueOne.printList();
        System.out.println(" 10 ");

        priorityQueueOne.add(4, "Justin1");
        priorityQueueOne.printList();
        System.out.println(" 11 ");

        priorityQueueOne.add(4, "Eric2");
        priorityQueueOne.printList();
        System.out.println(" 12 ");

        priorityQueueOne.removeTopPriority();
        priorityQueueOne.printList();
        System.out.println(" 13 ");

        priorityQueueOne.removeTopPriority();
        priorityQueueOne.printList();
        System.out.println(" 14 ");

        priorityQueueOne.removeTopPriority();
        priorityQueueOne.printList();
        System.out.println(" 15 ");

        priorityQueueOne.removeTopPriority();
        priorityQueueOne.printList();
        System.out.println(" 16 ");

        priorityQueueOne.removeTopPriority();
        //priorityQueueOne.printList();
        System.out.println(" 17 ");
        System.out.println(priorityQueueOne.peekTopPriority());

        priorityQueueOne.removeTopPriority();
        //priorityQueueOne.printList();
        System.out.println(" 18 ");
        System.out.println(priorityQueueOne.peekTopPriority());

        priorityQueueOne.removeTopPriority();

        //to see whats returned, if thats how it works..
        //System.out.println(priorityQueueOne.removeTopPriority());

        //priorityQueueOne.printList();
        System.out.println(" 19 ");

        priorityQueueOne.add(2, "Bob1");
        //priorityQueueOne.printList();
        System.out.println(" 1 ");

        priorityQueueOne.add(1, "Bab1");
        //priorityQueueOne.printList();
        System.out.println(" 2 ");

        priorityQueueOne.add(1, "Bob2");
        //priorityQueueOne.printList();
        System.out.println(" 3 ");

        System.out.println(priorityQueueOne.isEmpty());
        System.out.println(priorityQueueOne.peekTopPriority());

        System.out.println(priorityQueueOne.peekTopPriority());
    }
}
