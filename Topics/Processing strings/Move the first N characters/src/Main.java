import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] parts = str.split(" ", 2);
        String s = parts[0];
        String num = parts[1];
        int n = Integer.parseInt(num);
        if (n == 0 || n > s.length()) {
            System.out.println(s);
            return;
        }
        String firstPart = s.substring(0, n);
        s = s.substring(n);
        String output = s + firstPart;
        System.out.println(output);


    }
}