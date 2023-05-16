import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        double num1, num2, result, angle;

        while (choice != 28) {
            System.out.println("Scientific Calculator");
            System.out.println("--------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Tangent");
            System.out.println("9. Inverse Sine");
            System.out.println("10. Inverse Cosine");
            System.out.println("11. Inverse Tangent");
            System.out.println("12. Hyperbolic Sine");
            System.out.println("13. Hyperbolic Cosine");
            System.out.println("14. Hyperbolic Tangent");
            System.out.println("15. Signum");
            System.out.println("16. Round");
            System.out.println("17. Truncation");
            System.out.println("18. Natural Logarithm (base e)");
            System.out.println("19. Absolute Value");
            System.out.println("20. Floor");
            System.out.println("21. Ceiling");
            System.out.println("22. Exponential (e^x)");
            System.out.println("23. Power (x^y)");
            System.out.println("24. Square root");
            System.out.println("25. Power of 10");
            System.out.println("26. Logarithm (base 10)");
            System.out.println("27. Logarithm (custom base)");
            System.out.println("28. Factorial");
            System.out.println("29. Minimum");
            System.out.println("30. Maximum");
            System.out.println("31. Cube Root");
            System.out.println("32. Permutation");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                }
                case 2 -> {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                }
                case 3 -> {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                }
                case 4 -> {
                    System.out.print("Enter dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    num2 = scanner.nextDouble();
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                case 5 -> {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                }
                case 6 -> {
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                }
                case 7 -> {
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                }
                case 8 -> {
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                }
                case 9 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.asin(num1);
                    System.out.println("Result: " + result);
                }
                case 10 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.acos(num1);
                    System.out.println("Result: " + result);
                }
                case 11 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.atan(num1);
                    System.out.println("Result: " + result);
                }
                case 12 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.sinh(num1);
                    System.out.println("Result: " +
                            result);
                }
                case 13 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.cosh(num1);
                    System.out.println("Result: " + result);
                }
                case 14 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.tanh(num1);
                    System.out.println("Result: " + result);
                }
                case 15 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.signum(num1);
                    System.out.println("Result: " + result);
                }
                case 16 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.round(num1);
                    System.out.println("Result: " + result);
                }
                case 17, 20 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.floor(num1);
                    System.out.println("Result: " + result);
                }
                case 18 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.log(num1);
                    System.out.println("Result: " + result);
                }
                case 19 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.abs(num1);
                    System.out.println("Result: " + result);
                }
                case 21 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.ceil(num1);
                    System.out.println("Result: " + result);
                }
                case 22 -> {
                    System.out.print("Enter the value: ");
                    num1 = scanner.nextDouble();
                    result = Math.exp(num1);
                    System.out.println("Result: " + result);
                }
                case 23 -> {
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                }
                case 24 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.sqrt(num1);
                    System.out.println("Result: " + result);
                }
                case 25 -> {
                    System.out.print("Enter the power: ");
                    num1 = scanner.nextDouble();
                    result = Math.pow(10, num1);
                    System.out.println("Result: " + result);
                }
                case 26 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.log10(num1);
                    System.out.println("Result: " + result);
                }
                case 27 -> {
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.log(num1) / Math.log(base);
                    System.out.println("Result: " + result);
                }
                case 28 -> {
                    System.out.print("Enter a positive integer:");
                    int n = scanner.nextInt();
                    result = factorial(n);
                    System.out.println("Result: " + result);
                }
                case 29 -> {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = Math.min(num1, num2);
                    System.out.println("Result: " + result);
                }
                case 30 -> {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = Math.max(num1, num2);
                    System.out.println("Result: " + result);
                }
                case 0 -> System.out.println("Goodbye!");

                case 31 -> {
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.cbrt(num1);
                    System.out.println("Result: " + result);
                }
                case 32 -> {
                    System.out.print("Enter the total number of items: ");
                    int totalItems = scanner.nextInt();
                    System.out.print("Enter the number of selected items: ");
                    int selectedItems = scanner.nextInt();
                    result = permutation(totalItems, selectedItems);
                    System.out.println("Result: " + result);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }


            System.out.println();
        }

        scanner.close();
    }

    public static double permutation(int totalItems, int selectedItems) {
        return factorial(totalItems) / factorial(totalItems - selectedItems);
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
