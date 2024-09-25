
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator39 {

    public static void main(String args[]) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1; //1 is for swap
                } else {
                    return -1; //-1 is not swap
                }
            }
        };
        List<Integer> num = new ArrayList<Integer>();
        num.add(21);
        num.add(12);
        num.add(53);
        num.add(45);

        Collections.sort(num, com);
        System.out.println(num);
    }
}
