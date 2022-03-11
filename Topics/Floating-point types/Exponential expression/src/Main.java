import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double x = scanner.nextDouble();
        double xSquare = x * x;
        double xCube = x * x * x;
        double constant = 1;
        double ans = xCube + xSquare + x + constant;
        System.out.println(ans);
    }
}