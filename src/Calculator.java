public class Calculator {

    private static final NumeralSystem[] systems = {
            new ArabicNumeralSystem(),
            new RomanNumeralSystem()
    };

    public static String calc(String expression) {
        String[] parts = expression.trim().split("\\s+");
            if (parts.length != 3)
                throw new IllegalArgumentException("Ожидается: <число> <операция> <число>");

        String left = parts[0], op = parts[1], right = parts[2];
        NumeralSystem system = CheckSystem(left,right);

        int a = system.parse(left);
        int b = system.parse(right);
        int result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b; // вот тут надо заменить на функцию. А лучше все переопределить
            case "*" -> a * b;
            case "/" -> { // вот тут надо заменить на функцию. А лучше все переопределить
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Неизвестный оператор");
        };

            return system.format(result);
    }


static NumeralSystem CheckSystem(String left, String right)
    {
        for (NumeralSystem sys : systems) {
            if (sys.isValid(left) && sys.isValid(right)) return sys;
        }
        throw new IllegalArgumentException("Числа должны быть в одной системе: оба римские или оба арабские");
    }

}
