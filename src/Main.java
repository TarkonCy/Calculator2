import java.util.Scanner;

/*
    Строка формата "1  +    2" считается допустимой. Пробелы игнорируются
    Cтрока формата "1+2" без пробелов не поддерживается, считается некорректной
    Пустая строка считается некорректной
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Считываем строчку, проверяем что не пустая. Если пустая - кидаем эксепшен
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите требуемое вычисление: ");
        String str = scanner.nextLine();
        if (str.isEmpty()) throw new IllegalArgumentException("Пустая строка");

        //Понеслись считать!
        String result = Calculator.calc(str);
        System.out.println("Результат: " + result);

        scanner.close();
    }


    }