import java.util.Arrays;

public class Ejercicio2 {

    public boolean ejecutar(Integer[] arr1, Integer[] arr2) {
        // validar si los arreglos son validos.
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0 || arr1.length != arr2.length) {
            return false;
        }

        for (int v1 : arr1) {
            int vcuadrado = (int) Math.pow(v1, 2);

            if (!Arrays.asList(arr2).contains(vcuadrado)) {
                return false;
            }
        }

        return true;
    }

}
