import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        final int num = 10;
        while (true) {
            String input = scanner.next();
            if ("0".equals(input)) {
                break;
            }
            try {
                System.out.println(Integer.parseInt(input) * num);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}