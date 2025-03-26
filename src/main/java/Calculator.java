import java.util.Scanner;
 //Новый калькулятор
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculator = new Calc(); // Создаем экземпляр калькулятора

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите операцию: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;
        try {
            switch (operator) {
                case '+':
                    result = calculator.sum(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Ошибка: неверная операция!");
                    return;
            }
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static class Calc {

        public double sum(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Ошибка: деление на ноль!");
            }
            return a / b;
        }
    }
}

