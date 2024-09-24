
public class lambda28 {

    public static void main(String args[]) {
        A obj = () -> System.out.println("in A show");
        obj.show();
    }
}

interface A {

    void show();
}
