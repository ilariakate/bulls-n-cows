import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String output = "";

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            output = output + ch + ch;
            i++;
        }
        System.out.println(output);

    }
}