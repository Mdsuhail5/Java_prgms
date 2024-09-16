
public class prgm20 {

    public static void main(String args[]) {
        A obj = (A) new B();   //upcasting
        obj.show1();

        B obj1 = (B) obj;   //Downcasting
        obj1.show2();
    }
}

class A {

    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {

    public void show2() {
        System.err.println("in B show");
    }
}
