import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {

        HashMap<String, Integer> answer = new HashMap<>();

        for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
            List<String> alphebets = entry.getValue();

            for (int i = 0; i < alphebets.size(); i++) {
                String key = alphebets.get(i).toLowerCase();
                Integer value = entry.getKey();
                answer.put(key, value);
            }
        }
        return answer;
    }
}
