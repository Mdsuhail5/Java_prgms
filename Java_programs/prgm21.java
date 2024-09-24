
class prgm21 {

    public static void main(String args[]) {
        int num = 50;
        Integer num1 = num;     //Auto-boxing

        System.out.println(num1);

        int num2 = num1;      //Auto-unboxing
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str); //Converting a string to integer using the Integer class
        System.out.println(num3 * 5);

    }
}
