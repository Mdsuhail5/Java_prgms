
class thread30 {

    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();

    }
}

class A extends Thread {

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

class B extends Thread {

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
