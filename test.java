import java.util.Comparator;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };
        Integer[] arr = new Integer[7];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 0;
        arr[5] = -1;
        arr[6] = 5;



        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        System.out.println(list.size());


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);





    }
}
