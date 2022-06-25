import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {

    public String[] ejecutar(String elementos) {
        Map<String, Integer> mapa = new HashMap<>();

        String[] temp1 = elementos.split(",");

        for (String t1 : temp1) {
            String[] temp2 = t1.trim().split(":");

            if (mapa.containsKey(temp2[0])) {
                Integer sum = mapa.get(temp2[0]);

                sum += Integer.parseInt(temp2[1]);
                mapa.put(temp2[0], sum);
            } else {
                mapa.put(temp2[0], Integer.parseInt(temp2[1]));
            }
        }

        return mapa.entrySet().stream()
            .map(e -> e.getKey() + ":" + e.getValue())
            .toArray(String[]::new);
    }

}
