import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        final double a1 = 10.5;
        final double b1 = 4.4;
        final double c1 = 2.2;
        double ans = a * a1 + b * b1 + (c + d) / c1;
        System.out.println(ans);
    }
}