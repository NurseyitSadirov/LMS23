import java.util.*;

public class SortAll implements MethodAble {



    @Override
    public int[] array(int[] array) {
        Arrays.sort(array);
        return  array;
    }

    @Override
    public ArrayList<Integer> student(ArrayList<Integer> students) {
        Collections.sort(students);
        return students;
    }

    @Override
    public LinkedList<Integer> lin(LinkedList<Integer> list) {
        Collections.sort(list);
        return list;
    }

    @Override
    public int compareTo(SortAll o) {
        return 0;
    }


}
