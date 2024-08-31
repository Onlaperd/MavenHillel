package Homework_22;

public class Test {

    public static void main(String[] args) {
        SingleWayOneList<Integer> singleWayList = new SingleWayOneList<>();
        singleWayList.add(1);
        singleWayList.add(2);
        singleWayList.add(3);
        singleWayList.add(4);
        singleWayList.add(5);

        singleWayList.removeLast();
        singleWayList.removeFirst();

        singleWayList.printList();

        System.out.println(singleWayList.get(2));
        System.out.println(singleWayList.getFirst());
        System.out.println(singleWayList.getLast());
        System.out.println(singleWayList.getSize());

        System.out.println("---");

        singleWayList.addFirst(30);
        singleWayList.setValue(1 ,100);

        singleWayList.printList();



    }

}