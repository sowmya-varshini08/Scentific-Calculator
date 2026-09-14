import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        ScientificOperations scientific = new ScientificOperations();

        while (true) {

            System.out.println("\n=================================");
            System.out.println("      SCIENTIFIC CALCULATOR");
            System.out.println("=================================");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Cube Root");
            System.out.println("9. Factorial");
            System.out.println("10. Sin");
            System.out.println("11. Cos");
            System.out.println("12. Tan");
            System.out.println("13. Log10");
            System.out.println("14. Natural Log");
            System.out.println("15. Absolute Value");
            System.out.println("16. Percentage");
            System.out.println("17. Exit");

            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter first number: ");
                        double a = scanner.nextDouble();

                        System.out.print("Enter second number: ");
                        double b = scanner.nextDouble();

                        System.out.println(
                                "Result = " + calculator.add(a, b)
                        );

                        break;

                    case 2:

                        System.out.print("Enter first number: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter second number: ");
                        b = scanner.nextDouble();

                        System.out.println(
                                "Result = " + calculator.subtract(a, b)
                        );

                        break;

                    case 3:

                        System.out.print("Enter first number: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter second number: ");
                        b = scanner.nextDouble();

                        System.out.println(
                                "Result = " + calculator.multiply(a, b)
                        );

                        break;

                    case 4:

                        System.out.print("Enter first number: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter second number: ");
                        b = scanner.nextDouble();

                        System.out.println(
                                "Result = " + calculator.divide(a, b)
                        );

                        break;

                    case 5:

                        System.out.print("Enter first number: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter second number: ");
                        b = scanner.nextDouble();

                        System.out.println(
                                "Result = " + calculator.modulus(a, b)
                        );

                        break;

                    case 6:

                        System.out.print("Enter base: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter exponent: ");
                        b = scanner.nextDouble();

                        System.out.println(
                                "Result = " + scientific.power(a, b)
                        );

                        break;

                    case 7:

                        System.out.print("Enter number: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "Result = " + scientific.squareRoot(a)
                        );

                        break;

                    case 8:

                        System.out.print("Enter number: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "Result = " + scientific.cubeRoot(a)
                        );

                        break;

                    case 9:

                        System.out.print("Enter a positive integer: ");
                        int number = scanner.nextInt();

                        System.out.println(
                                "Result = " + scientific.factorial(number)
                        );

                        break;

                    case 10:

                        System.out.print("Enter angle in degrees: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "sin(" + a + ") = " + scientific.sin(a)
                        );

                        break;

                    case 11:

                        System.out.print("Enter angle in degrees: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "cos(" + a + ") = " + scientific.cos(a)
                        );

                        break;

                    case 12:

                        System.out.print("Enter angle in degrees: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "tan(" + a + ") = " + scientific.tan(a)
                        );

                        break;

                    case 13:

                        System.out.print("Enter number: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "log10(" + a + ") = "
                                        + scientific.logarithm(a)
                        );

                        break;

                    case 14:

                        System.out.print("Enter number: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "ln(" + a + ") = "
                                        + scientific.naturalLog(a)
                        );

                        break;

                    case 15:

                        System.out.print("Enter number: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "Absolute value = "
                                        + scientific.absolute(a)
                        );

                        break;

                    case 16:

                        System.out.print("Enter number: ");
                        a = scanner.nextDouble();

                        System.out.println(
                                "Percentage = "
                                        + scientific.percentage(a)
                        );

                        break;

                    case 17:

                        System.out.println(
                                "Thank you for using Scientific Calculator!"
                        );

                        scanner.close();
                        return;

                    default:

                        System.out.println(
                                "Invalid choice. Please try again."
                        );
                }

            } catch (ArithmeticException | IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {

                System.out.println(
                        "Invalid input. Please enter the correct value."
                );

                scanner.nextLine();
            }
        }
    }
}