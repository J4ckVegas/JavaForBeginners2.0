import java.util.Scanner;



public class Task01 {
    public static void main(String[] args) {
        /** Метод выполняющий арифметические действия с двумя числами
         * @author Volokhov-YUV */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите операцию:");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.4f", result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.4f", result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.4f", result);
                break;
            case '/':
                result = num1 / num2;
                System.out.printf("%.4f", result);
                break;
        }
        scanner.close();
    }
}