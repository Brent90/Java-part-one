
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password

        String password = "";

        for (int i = 0; i < this.length; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            password += symbol;
        }
        return password;
    }
}
