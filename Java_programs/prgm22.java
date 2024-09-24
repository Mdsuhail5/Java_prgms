
class prgm22 {

    public static void main(String args[]) {
        Car obj1 = new updatedWagonR();
        obj1.drive();
        obj1.playMusic();
        obj1.fly();
    }
}

abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing...");
    }

}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("Driving...");
    }
}

class updatedWagonR extends WagonR {

    public void fly() {
        System.out.println("Flying...");
    }
}
