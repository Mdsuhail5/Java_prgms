
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamapi42 {

    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(2, 7, 5, 4, 13, 11, 6, 8);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);

        List<Integer> a = Arrays.asList(2, 7, 5, 4, 13, 11, 6, 8);
        int result = a.stream();
        .filter(n -> n % 2 == 0);
        .map(n -> n * 2);
        .reduce();

    }
}
