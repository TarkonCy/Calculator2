
public class ArabicNumeralSystem implements NumeralSystem {
    public int parse(String value) {
        return Integer.parseInt(value);
    }
    public String format(int value) {
        return Integer.toString(value);
    }
    public boolean isValid(String value) {
        return value.matches("\\d+");
    }
}
