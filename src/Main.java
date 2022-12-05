import java.util.*;

public class Main {
    public static  void main(String[] args) {
        SortAll sortAll = new SortAll();
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 1; i < array.length; i++) {
            array[i]=random.nextInt(0,2);
        }
        System.out.print(" sort  Array :");
        System.out.println(Arrays.toString(sortAll.array(array)));

        ArrayList<Integer> sortAlls = new ArrayList<>();
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));
        sortAlls.add(random.nextInt(0,2));

        System.out.print(" sort  ArrayList :");
        System.out.println(sortAll.student(sortAlls));


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));
        linkedList.add(random.nextInt(0,2));

        System.out.print(" sort  LinkedLIst :");
        System.out.println(sortAll.lin(linkedList));

    }


}