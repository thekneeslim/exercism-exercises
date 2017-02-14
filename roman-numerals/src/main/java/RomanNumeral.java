import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
    int arg;

    RomanNumeral(int number) {
        arg = number;
    }

    public String getRomanNumeral() {
        String answer;
        if (arg == 0) {
            return "";
        } else {
            answer = "";

            Map<Integer, String> template = new LinkedHashMap<>();

            template.put(1000, "M");
            template.put(900, "CM");
            template.put(500, "D");
            template.put(400, "CD");
            template.put(100, "C");
            template.put(90, "XC");
            template.put(50, "L");
            template.put(40, "XL");
            template.put(10, "X");
            template.put(9, "IX");
            template.put(5, "V");
            template.put(4, "IV");
            template.put(1, "I");

            for (Map.Entry<Integer, String> entry : template.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();

                if (arg >= key) {
                    int iterations = arg / key;
                    for (int i = 0; i < iterations; i++) {
                        answer += value;
                    }
                    arg -= iterations * key;
                }
            }
        }
        return answer;
    }
}
