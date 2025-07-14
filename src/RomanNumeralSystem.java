import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralSystem implements NumeralSystem {

    private static final Map<Character, Integer> romanMap = Map.ofEntries(
            Map.entry('I', 1),
            Map.entry('V', 5),
            Map.entry('X', 10),
            Map.entry('L', 50),
            Map.entry('C', 100),
            Map.entry('D', 500),
            Map.entry('M', 1000)
    );

    private static final TreeMap<Integer, String> intMap = new TreeMap<>(Comparator.reverseOrder());

    static {
        intMap.put(100, "C");
        intMap.put(90, "XC");
        intMap.put(50, "L");
        intMap.put(40, "XL");
        intMap.put(10, "X");
        intMap.put(9, "IX");
        intMap.put(5, "V");
        intMap.put(4, "IV");
        intMap.put(1, "I");
    }

    /*
    private static final TreeMap<Integer, String> intMap = new TreeMap<>(
            Map.ofEntries(
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
    public int parse(String str) {
        int total = 0;
        int prev = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int value = romanMap.get(str.charAt(i));
            if (value < prev) {
                total -= value;
            } else {
                total += value;
            }
            prev = value;
        }

        if (total > 10 ) throw new ArithmeticException("Число должно быть от I до X");
        return total;
    }

    public String format(int value) {
        //большой красивый код по переводу из числа обратно в римские цифирки
        // Сначала проверяем что число положительное
        if(value <= 0) throw new ArithmeticException("Неположительный результат только для арабских");

        //Если все ОК - конвертируем
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : intMap.entrySet()) {
            while (value >= entry.getKey()) {
                sb.append(entry.getValue());
               value -= entry.getKey();
            }
        }
        return sb.toString();
    }

    public boolean isValid(String value) {
        return value.matches("[IVX]+");
    }
}

