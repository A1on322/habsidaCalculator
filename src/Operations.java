public class Operations {

    public static int Result (String input) throws Exception {
        int a = Checking.a;
        int b = Checking.b;
        int result;

        String[] tempChar = input.split("\\s");

        if (tempChar.length == 5) {
            int c = Checking.c;
            //if (tempChar[1] == "*" || tempChar[1] == "/" && tempChar[3] != "*" || tempChar[3] != "/")
            //не работает, потому что нельзя сравнивать строки с помощью == оператора
            if (tempChar[1].equals("*") || tempChar[1].equals("/") && tempChar[3].equals("+") || tempChar[3].equals("-")){
                a = Calculate(tempChar[1], a, b);
                return result = Calculate(tempChar[3], a, c);
            }
            else {
                b  = Calculate(tempChar[3], b, c);
                return result = Calculate(tempChar[1], a, b);
            }
        }
        // Executed if number of operands = 3
        else {
            return result = Calculate(tempChar[1], a, b);
        }
    }

    public static int Calculate(String operator, int a, int b) throws Exception {
        int tmp = 0;
        switch (operator) {
            case "+":
                return tmp = a + b;
            case "-":
                return tmp = a - b;
            case "*":
                return tmp = a * b;
            case "/":
                return tmp = a / b;
            default:
                throw new Exception("Used wrong operator");
        }
    }
}
