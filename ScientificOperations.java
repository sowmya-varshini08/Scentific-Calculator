public class ScientificOperations {

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                    "Square root of negative number is not possible"
            );
        }

        return Math.sqrt(number);
    }

    public double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public long factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                    "Factorial is not defined for negative numbers"
            );
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    public double sin(double degree) {
        return Math.sin(Math.toRadians(degree));
    }

    public double cos(double degree) {
        return Math.cos(Math.toRadians(degree));
    }

    public double tan(double degree) {
        return Math.tan(Math.toRadians(degree));
    }

    public double logarithm(double number) {

        if (number <= 0) {
            throw new IllegalArgumentException(
                    "Logarithm is defined only for positive numbers"
            );
        }

        return Math.log10(number);
    }

    public double naturalLog(double number) {

        if (number <= 0) {
            throw new IllegalArgumentException(
                    "Natural log is defined only for positive numbers"
            );
        }

        return Math.log(number);
    }

    public double absolute(double number) {
        return Math.abs(number);
    }

    public double percentage(double number) {
        return number / 100;
    }
}