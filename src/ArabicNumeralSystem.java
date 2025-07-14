
public class ArabicNumeralSystem implements NumeralSystem {
    public int parse(String value) {
        int i = Integer.parseInt(value);
        if (i > 10 || i < 1) throw new ArithmeticException("Число должно быть от 1 до 10");
        return i;
    }
    public String format(int value) {
        return Integer.toString(value);
    }
    public boolean isValid(String value) {
        return value.matches("\\d+");
    }
}
