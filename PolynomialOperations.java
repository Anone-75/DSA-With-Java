import java.util.Scanner;

class Polynomial {
    private int degree;
    private double[] coefficients;

    public Polynomial(int degree) {
        this.degree = degree;
        coefficients = new double[degree + 1];
    }

    public void setCoefficient(int power, double coefficient) {
        coefficients[power] = coefficient;
    }

    public double getCoefficient(int power) {
        return coefficients[power];
    }

    public int getDegree() {
        return degree;
    }

    public Polynomial add(Polynomial other) {
        int maxDegree = Math.max(this.degree, other.degree);
        Polynomial result = new Polynomial(maxDegree);

        for (int i = 0; i <= maxDegree; i++) {
            double coeff1 = (i <= this.degree) ? this.getCoefficient(i) : 0;
            double coeff2 = (i <= other.degree) ? other.getCoefficient(i) : 0;
            result.setCoefficient(i, coeff1 + coeff2);
        }

        return result;
    }

    public Polynomial subtract(Polynomial other) {
        int maxDegree = Math.max(this.degree, other.degree);
        Polynomial result = new Polynomial(maxDegree);

        for (int i = 0; i <= maxDegree; i++) {
            double coeff1 = (i <= this.degree) ? this.getCoefficient(i) : 0;
            double coeff2 = (i <= other.degree) ? other.getCoefficient(i) : 0;
            result.setCoefficient(i, coeff1 - coeff2);
        }

        return result;
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree; i >= 0; i--) {
            if (coefficients[i] != 0) {
                if (coefficients[i] > 0 && sb.length() != 0) {
                    sb.append(" + ");
                } else if (coefficients[i] < 0) {
                    sb.append(" - ");
                }
                if (Math.abs(coefficients[i]) != 1 || i == 0) {
                    sb.append(Math.abs(coefficients[i]));
                }
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}

public class PolynomialOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the degree of the first polynomial:");
        int degree1 = scanner.nextInt();
        Polynomial poly1 = new Polynomial(degree1);

        System.out.println("Enter the coefficients of the first polynomial in descending order of power:");
        for (int i = degree1; i >= 0; i--) {
            System.out.println("Coefficient of x^" + i + ":");
            poly1.setCoefficient(i, scanner.nextDouble());
        }

        System.out.println("Enter the degree of the second polynomial:");
        int degree2 = scanner.nextInt();
        Polynomial poly2 = new Polynomial(degree2);

        System.out.println("Enter the coefficients of the second polynomial in descending order of power:");
        for (int i = degree2; i >= 0; i--) {
            System.out.println("Coefficient of x^" + i + ":");
            poly2.setCoefficient(i, scanner.nextDouble());
        }

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        int choice = scanner.nextInt();

        Polynomial result;
        if (choice == 1) {
            result = poly1.add(poly2);
            System.out.println("Result of addition:");
        } else if (choice == 2) {
            result = poly1.subtract(poly2);
            System.out.println("Result of subtraction:");
        } else {
            System.out.println("Invalid choice");
            return;
        }

        result.display();

        scanner.close();
    }
}
