public interface NumeralSystem {
    int parse(String value);
    String format(int value);
    boolean isValid(String value);
}
