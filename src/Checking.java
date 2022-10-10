/*
This class is checking, whether user input follow requirements:
    1. 0 < input <= 10
    2. input - integer?
    3. operations only between 2 or 3 numbers
 */

public class Checking {
    public static int a,b,c;
    public static boolean checkAll(String input) throws Exception {
        int ops;

        String[] tempChar = input.split("\\s"); // split user input into array with space separator

        // Количество цифр над которыми будут проводиться операции
        ops = operands(tempChar);

        a = Integer.parseInt(tempChar[0]);
        b = Integer.parseInt(tempChar[2]);
        if (a > 10 || b > 10) {
            throw new Exception("You can't enter integer greater than 10");
        }
        if (ops != 3) {
            c = Integer.parseInt(tempChar[4]);
            if (c > 10) throw new Exception("You can't enter integer greater than 10");
        }
        return true;
    }


    public static int operands(String[] tempChar) throws Exception {
        if (tempChar.length == 3) {
            return 3;
        }
        else if (tempChar.length == 5) {
            return 5;
        }
        else throw new Exception("You can use only 2 or 3 numbers");
    }
}



