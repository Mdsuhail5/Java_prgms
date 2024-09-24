
public class lambda27 {

    public static void main(String args[]) {
        A obj = new A() {
            public void show() {
                System.out.println("in A show");
            }
        };
        obj.show();
    }
}

interface A {

    void show();
}
