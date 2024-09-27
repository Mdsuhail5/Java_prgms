
import java.util.Arrays;
import java.util.List;

public class foreach41 {

    public static void main(String args[]) {
        List<Integer> num = Arrays.asList(2, 4, 6, 7, 5);
        num.forEach(n -> System.out.println(n));
    }
}
