public class RomanNumeralSystem implements NumeralSystem {
    /*
    private static final Map<Character, Integer> romanMap = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
    );

    private static final TreeMap<Integer, String> intMap = new TreeMap<>(Map.ofEntries(
            Map.entry(1000, "M"),
            Map.entry(900, "CM"),
            Map.entry(500, "D"),
            Map.entry(400, "CD"),
            Map.entry(100, "C"),
            Map.entry(90, "XC"),
            Map.entry(50, "L"),
            Map.entry(40, "XL"),
            Map.entry(10, "X"),
            Map.entry(9, "IX"),
            Map.entry(5, "V"),
            Map.entry(4, "IV"),
            Map.entry(1, "I")
    ));
*/
    public int parse(String value) {
        return Integer.parseInt(value);
        //большой красивый код по переводу из римской системы в цифирку
    }

    public String format(int value) {
        //большой красивый код по переводу из числа обратно в римские цифирки
        return Integer.toString(value);
    }

    public boolean isValid(String value) {
        return value.matches("[IVX]+");
    }
}

