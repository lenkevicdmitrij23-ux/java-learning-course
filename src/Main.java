import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию: ");

        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();




        double result = 0;
        boolean isValid = true;

        if (operation == '+'){
            result = a + b;
        }else if(operation == '-'){
            result = a - b;
        }else if(operation == '*'){
            result = a * b;
        }else if(operation == '/'){
            if(b == 0){
                System.out.println("Error");
                isValid = false;
            }else {
                result = a / b;
            }
        }else {
            System.out.println("Ошибка: неизвестная операция!");
            isValid = false;
        }

        if (isValid){
            System.out.println("Результат: " + result);
        }


        scanner.close();

    }
}