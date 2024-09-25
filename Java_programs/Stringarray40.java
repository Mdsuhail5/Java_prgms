
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stringarray40 {

    public static void main(String args[]) {

        Comparator<String> com = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length()) {
                    return 1; 
                }else {
                    return -1;
                }
            }
        };
        List<String> num = new ArrayList<String>();
        num.add("hello");
        num.add("how");
        num.add("your");
        num.add("me");

        Collections.sort(num, com);
        System.out.println(num);
    }
}
