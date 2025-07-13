import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите требуемое вычисление: ");
        int a = scanner.nextInt();
        String Operand = scanner.next();
        int b = scanner.nextInt();

        System.out.println("Принято, " + a +" "+Operand +" " + b);


        int result = switch (Operand) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Неизвестный оператор: " + Operand);
        };


        System.out.println("Результат: "+result);

        scanner.close();
    }


    }