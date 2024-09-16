
class block18 {

    public static void main(String args[]) {
        Mobile objMobile1 = new Mobile();
        objMobile1.brand = "Apple";
        objMobile1.price = 1600;
        Mobile.name = "SmartPhone";

        Mobile objMobile2 = new Mobile();
        objMobile2.brand = "Samsung";
        objMobile2.price = 1800;
        Mobile.name = "SmartPhone";
        objMobile1.show();
        objMobile2.show();
    }
}

class Mobile {

    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = " ";
        price = 200;
        System.out.println("in constructor block");
    }

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}
