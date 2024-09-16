
public class array15 {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("navin");
        sb.capacity();
        sb.length();
        sb.append("reddy");
        System.err.println(sb);
        sb.insert(6, " ");
        System.err.println(sb);
        sb.deleteCharAt(6);
        System.err.println(sb);

    }
}
