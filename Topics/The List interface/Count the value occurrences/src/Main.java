import java.util.Collections;
import java.util.List;


class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        int freq1 = Collections.frequency(list1, elem);
        int freq2 = Collections.frequency(list2, elem);

        return freq1 == freq2;
    }
}
