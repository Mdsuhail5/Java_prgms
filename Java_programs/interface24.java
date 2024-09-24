// class - class -> extends;
//class - interface -> implements;
//interface - interface -> extends;

class interface24 {

    public static void main(String args[]) {
        A obj = new B();
        obj.config();
        obj.show();
        X obj1 = new B();
        obj1.run();
    }
}

interface A {

    int age = 34;
    String place = "Mumbai";

    void show();

    void config();
}

interface X {

    void run();
}

interface Y extends X {

}

class B implements A, X {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");

    }
}
