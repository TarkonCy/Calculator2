import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Считываем строчку, проверяем что не пустая. Если пустая - кидаем эксепшен
        Scanner scanner = new Scanner(System.in);
        String str = null;

        System.out.print("Введите требуемое вычисление: ");
        str = scanner.nextLine();
        if (str.isEmpty()) throw new IllegalArgumentException("Пустая строка");

        //Понеслись считать!

        try {
            String result = Calculator.calc(str);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }


    }