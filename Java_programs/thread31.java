
class thread30 {

    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
//      Runnable obj1 = new A();
//     Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}

class A implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("continue");
            }
        }
    }
}

class B implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("continue");
            }
        }
    }
}
