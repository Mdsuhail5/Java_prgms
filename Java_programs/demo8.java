// Method overloading: creating different methods with different arguments

public class demo8 {

    public static void main(String args[]) {
        Calculator obj = new Calculator();
        int result = obj.add(5, 3, 4);
        System.out.println(result);

    }
}

class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
