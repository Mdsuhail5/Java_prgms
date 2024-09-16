
class set19 {

    public static void main(String args[]) {
        Human obj = new Human();
        obj.setAge(24);
        obj.setName("venom");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

class Human {

    private int age;
    private String name;

    public Human() {
        System.out.println("in constructor...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
