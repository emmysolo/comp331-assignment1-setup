public class Main {
    public static void main(String[] args) {
        System.out.println("Java setup is working.");

        //method for multiplying two numbers

        int num1 = 5;
        int num2 = 10;
        int product = multiply(num1, num2);

        System.out.println(num1 + " * " + num2 + " = " + product);
    }

    private static int multiply(int first, int second) {
        return first * second;
    }
}