import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Введите первое число или exit: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.print("До свидания");
                break;

            }
            double a = Double.parseDouble(input);

            char operation = readOperation(scanner);

            double b = readNumber(scanner, "Введите второе число: ");

            double result = calculate(a, b, operation);

            printResult(result);


        }
        scanner.close();
    }

    public static double readNumber(Scanner scanner, String message) {
        System.out.print(message);
        double number = scanner.nextDouble();
        scanner.nextLine();  // ← СЪЕДАЕМ Enter, который остался после nextDouble()
        return number;
    }

    public static char readOperation(Scanner scanner) {
        System.out.print("Введите операцию: ");
        char operation = scanner.next().charAt(0);
        scanner.nextLine();  // ← СЪЕДАЕМ Enter, который остался после next()
        return operation;
    }
    public static double calculate(double a, double b, char operation){
        double result = 0;

        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            if (b == 0) {
                System.out.println("Ошибка: деление на ноль!");
                return 0;
            }
            result = a / b;
        } else {
            System.out.println("Ошибка: неизвестная операция!");
            return 0;
        }

        return  result;
    }

    public static void printResult(double result){
        System.out.println("результат " + result);
    }
}