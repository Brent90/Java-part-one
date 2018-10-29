
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatestOne = Math.max(number1, number2);
        int greatestTwo = Math.max(number2, number3);
        int greatest = Math.max(greatestOne, greatestTwo);

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(25, 57, 13);
        System.out.println("Greatest: " + result);
    }
}
