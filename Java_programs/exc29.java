
public class exc29 {

    public static void main(String args[]) {
        int i = 2;
        int j = 0;
        int num[] = new int[5];
        try {
            j = 18 / i;
            System.out.println(num[5]);
        } catch (ArithmeticException e) {
            System.out.println("zero error" + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of index range " + e);

        } catch (Exception e) {
            System.out.println("something went wrong" + e);
        }
    }
}
