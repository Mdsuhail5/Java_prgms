
import java.util.HashMap;
import java.util.Map;

public class Map37 {

    public static void main(String args[]) {
        Map<String, Integer> nums = new HashMap<>();
        nums.put("navin", 65);
        nums.put("harsh", 45);
        nums.put("sushil", 75);

        System.out.println(nums);
        for (String key : nums.keySet()) {
            System.out.println(key + " : " + nums.get(key));
        }

    }
}
