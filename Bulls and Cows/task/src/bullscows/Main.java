package bullscows;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting no. of digits as input
        System.out.println("Input the length of the secret code");
        String numberOfDigitsStr = scanner.nextLine();
        if (numberOfDigitsStr.chars().allMatch(Character::isDigit) == Boolean.FALSE) {
            System.out.println("Error: \"" + numberOfDigitsStr + "\" isn't a valid number.");
            return;
        }

        int numberOfDigits = Integer.parseInt(numberOfDigitsStr);

        if (numberOfDigits == 0) {
            System.out.println("Error: \"" + numberOfDigitsStr + "\" isn't a valid number.");
            return;
        }

        // getting number of possible symbols
        System.out.println("Input the number of possible symbols in the code:");
        String numberOfPossibleSymbolsStr = scanner.nextLine();
        if (numberOfPossibleSymbolsStr.chars().allMatch(Character::isDigit) == Boolean.FALSE) {
            System.out.println("Error: \"" + numberOfPossibleSymbolsStr + "\" isn't a valid number.");
            return;
        }

        int numberOfPossibleSymbols = Integer.parseInt(numberOfPossibleSymbolsStr);


        final int maxPossibleSymbols = 36;

        if (numberOfPossibleSymbols < numberOfDigits) {
            System.out.println("Error: it's not possible to generate a code with a length of " + numberOfDigits + " with " + numberOfPossibleSymbols + " unique symbols.");
            return;
        }
        if (numberOfPossibleSymbols > maxPossibleSymbols) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return;
        }

        String asterisk = fillSymbol(numberOfDigits);
        String possibleChars = getPossibleChars(numberOfPossibleSymbols);
        String range = getPossibleRange(possibleChars);
        System.out.println("The secret is prepared: " + asterisk + range + ".");

        // game start
        System.out.println("Okay, let's start a game!");

        // generating secret code
        if (numberOfDigits > 10) {
            System.out.println("Error: can't generate a secret number with a length of " + numberOfDigits + " because there aren't enough unique digits.");
            return;
        }
        String possibleCode = getPossibleChars(numberOfPossibleSymbols);
        String result = getRandomSecretCode(numberOfDigits, possibleCode);


        // getting secret code from the user
        int counter = 1;
        while (!playOnce(result, counter, numberOfDigits)) {
            counter++;
        }

    }

    private static String fillSymbol(int numberOfDigits) {
        String fill = "";
        for (int i = 0; i < numberOfDigits; i++) {
            fill += "*";
        }
        return fill;
    }

    private static String getPossibleRange(String possibleChars) {
        String possibleRange = "";
        if (possibleChars.length() <= 10) {
            possibleRange = "(0-" + (possibleChars.length() - 1) + ")";
        } else {
            possibleRange = "(0-9) " + "(a-" + possibleChars.charAt(possibleChars.length() - 1) + ")";
        }
        return possibleRange;
    }

    private static String getPossibleChars(int numberOfPossibleSymbols) {
        String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";
        return symbols.substring(0, numberOfPossibleSymbols);
    }

    private static String getRandomSecretCode(int length, String maxPossibleSymbols) {
        String secretCode = "";
        Random random = new Random();
        while (secretCode.length() < length) {
            char randomChar = maxPossibleSymbols.charAt(random.nextInt(maxPossibleSymbols.length()));
            if (!secretCode.contains(randomChar + "")) secretCode += randomChar;
        }
        return secretCode;
    }

    private static boolean playOnce(String result, int counter, int secretLength) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Turn " + counter + ":");
        String input = scanner.nextLine();


        // checking the given input with the generated one

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == input.charAt(i)) {
                bulls++;
            }
        }

        if (bulls == secretLength) {
            System.out.println("Grade: " + secretLength + " bulls");
            System.out.println("Congratulations! You guessed the secret code.");
            return true;
        }

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != input.charAt(i) && input.contains(result.substring(i, i + 1))) {
                cows++;
            }
        }
        print(bulls, cows, result);
        return false;
    }

    private static void print(int bulls, int cows, String secretCode) {
        if (bulls == 0 && cows == 0) {
            System.out.println("Grade: None.");
        } else if (bulls == 0) {
            System.out.println("Grade: " + cows + " cows.");
        } else if (cows == 0) {
            System.out.println("Grade: " + bulls + " bulls.");
        } else {
            System.out.println("Grade: " + bulls + " bulls and " + cows + " cows.");
        }
    }

    private static String getRandomDigits(int n) {
        Random random = new Random();
        int m = (int) Math.pow(10, n - 1);
        return String.valueOf(m + random.nextInt(9 * m));
    }


}
