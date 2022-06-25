import java.util.Arrays;

public class Prueba {

    public static void main(String[] args) {
        System.out.println("Ejecutando ejercicio 1");
        ejecutarEjercicio1("a:3, b:4, a:6, f:0, h:2, b:10");

        System.out.println("Ejecutando ejercicio 2 - success");
        ejecutarEjercicio2(new Integer[]{1, 2, 3, 4, 5}, new Integer[]{4, 25, 9, 1, 16});
        System.out.println("Ejecutando ejercicio 2 - failed");
        ejecutarEjercicio2(new Integer[]{1, 2, 3, 4, 5}, new Integer[]{1, 3, 100, 34, 9});
        ejecutarEjercicio2(new Integer[]{1, 2, 3, 4, 5}, new Integer[]{});

        System.out.println("\n\nEjecutando ejercicio 3");
        ejecutarEjercicio3(new int[]{1, 10, 9, 1, 2, 3, 2, 7, 2, 1, 10, 3, 7, 1});
        System.out.println("");
        ejecutarEjercicio3(new int[]{2, 3, 4, 3, 4, 2, 5, 2, 5});

        System.out.println("\n\nEjecutando ejercicio 4");
        ejecutarEjercicio4(25);
        ejecutarEjercicio4(31);
        ejecutarEjercicio4(50);
        ejecutarEjercicio4(2045);
    }

    public static void ejecutarEjercicio1(String cadena) {
        Ejercicio1 ejercicio = new Ejercicio1();

        System.out.println("Cadena: " + cadena);
        String[] resp = ejercicio.ejecutar(cadena);

        System.out.print("Respuesta: [");
        for (int i=0; i < resp.length; ++i) {
            if (i > 0) {
                System.out.print(", ");
            }

            System.out.print(resp[i]);
        }
        System.out.print("]\n\n");
    }

    public static void ejecutarEjercicio2(Integer[] arr1, Integer[] arr2) {
        Ejercicio2 ejercicio = new Ejercicio2();

        boolean resp = ejercicio.ejecutar(arr1, arr2);

        System.out.println(Arrays.toString(arr1) + " - " + Arrays.toString(arr2));
        if (resp) {
            System.out.println(":) Todos los elementos del arreglo #1 estan en el arreglo #2 elevados al cuadrado.");
        } else {
            System.out.println(":( No todos los elementos del arreglo #1 estan en el arreglo #2 elevados al cuadrado.");
        }
    }

    public static void ejecutarEjercicio3(int[] arr) {
        Ejercicio3 ejercicio = new Ejercicio3();

        int resp = ejercicio.ejecutar(arr);

        System.out.println("respuesta: " + resp);
    }

    public static void ejecutarEjercicio4(int numero) {
        Ejercicio4 ejercicio = new Ejercicio4();

        System.out.println(numero + " a romano: " + ejercicio.ejecutar(numero));
    }
}
