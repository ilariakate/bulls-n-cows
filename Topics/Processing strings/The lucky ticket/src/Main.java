import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String numbers = String.valueOf(num);
        final int zero = 0;
        final int three = 3;
        String firstHalf = numbers.substring(zero, three);
        String lastHalf = numbers.substring(three);
        int firstThree = 0;
        int lastThree = 0;
        for (int i = 0; i < firstHalf.length(); i++) {
            firstThree += Integer.parseInt(String.valueOf(firstHalf.charAt(i)));
        }
        for (int i = 0; i < lastHalf.length(); i++) {
            lastThree += Integer.parseInt(String.valueOf(lastHalf.charAt(i)));
        }
        if (firstThree == lastThree) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}