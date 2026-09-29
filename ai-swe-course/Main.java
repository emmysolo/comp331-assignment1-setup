public class Main {
    public static void main(String[] args) {
        System.out.println("Java setup is working.");

        //method to add two numbers
       
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);

    }

    private static int addNumbers(int first, int second) {
        return first + second;
    }
}