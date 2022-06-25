public class Ejercicio4 {

    public String ejecutar(int numero) {
        int[] valores = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] literales = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0; i < valores.length; i++) {
            while(numero >= valores[i]) {
                numero -= valores[i];
                roman.append(literales[i]);
            }
        }

        return roman.toString();
    }

}
