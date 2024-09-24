

class interface22 {

    public static void main(String args[]) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        Developer navin = new Developer();
        navin.devapp(lap);
    }
}

interface Computer {

    void code();
}

class Developer {

    public void devapp(Computer lap) {
        lap.code();
    }
}

class Laptop implements Computer {

    public void code() {
        System.out.println("Coding: Compile: Run");
    }
}

class Desktop implements Computer {

    public void code() {
        System.out.println("Coding: Compile: Run: Faster");
    }
}
