import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String paliStr = "";

        for (int i = str.length() - 1; i >= 0; --i) {
            paliStr = paliStr + str.charAt(i);
        }

        if (str.equals(paliStr)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}