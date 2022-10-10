import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Checking check = new Checking();
    static Operations operations = new Operations();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arithmetic expression, using 2 or 3 numbers less than 10 and /, *, +, - operators");
        String input = scanner.nextLine();

        try {
            if(check.checkAll(input)) {
                System.out.println(operations.Result(input));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}