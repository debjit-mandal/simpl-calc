import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("---------------------");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exponentiation");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Logarithm");
            System.out.println("11. Absolute Value");
            System.out.println("12. Floor");
            System.out.println("13. Ceiling");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            double num1, num2, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    }
                    break;
                case 7:
                    System.out.print("Enter the angle in degrees: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                    break;
                case 8:
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                    break;
                case 9:
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                    break;
                case 10:
                    System.out.print("Enter the number: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter the base: ");
                    double b = scanner.nextDouble();
                    result = ((Math.log(a))/(Math.log(b)));
                    System.out.println("Result: " + result);
                    break;
                case 11:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.abs(num1);
                    System.out.println("Result: " + result);
                    break;
                case 12:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.floor(num1);
                    System.out.println("Result: " + result);
                    break;
                case 13:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.ceil(num1);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }


            System.out.println();
        }

        scanner.close();
    }
}
