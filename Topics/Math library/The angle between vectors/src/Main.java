import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double u1 = scanner.nextDouble();
        double u2 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();

        double uVector = Math.sqrt(u1 * u1 + u2 * u2);
        double vVector = Math.sqrt(v1 * v1 + v2 * v2);
        double uv = u1 * v1 + u2 * v2;
        double uvVector = uVector * vVector;

        double cos = uv / uvVector;
        double inverseCos = Math.acos(cos);
        double inDegrees = Math.toDegrees(inverseCos);
        System.out.println(inDegrees);

    }
}