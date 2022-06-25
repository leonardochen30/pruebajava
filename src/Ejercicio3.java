import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {

    public int ejecutar(int[] arr) {
        Map<Integer, Integer> elementos = new HashMap<>();

        // primero cuento las veces que esta cada numero en el arreglo.
        for (int valor : arr) {
            if (elementos.containsKey(valor)) {
                int cantidadAparece = elementos.get(valor);
                elementos.put(valor, cantidadAparece + 1);
            } else {
                elementos.put(valor, 1);
            }
        }

        for (int valor : arr) {
            // primero verificar si esta en el map de elementos, porque peude ser que ya se elimino antes
            if (!elementos.containsKey(valor)) continue;

            // si es divisible por cero entonces es par y eliminarlo.
            int cant = elementos.get(valor);
            int residuo = cant % 2;

            if (residuo == 0) {
                elementos.remove(valor);
            }
        }

        // solo voy a retornar el primer numero que aparece de formar impar
        Integer resp = null;

        for (Map.Entry<Integer, Integer> entry: elementos.entrySet()) {
            if (resp == null) resp = entry.getKey();

            System.out.println(Arrays.toString(arr) + " -> El numero " + entry.getKey() + ", aparece de formar impar " + entry.getValue() + " veces.");
        }

        return resp;
    }
}
