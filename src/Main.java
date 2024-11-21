import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] initArray = {"w", "e", "r", "f"};


        Set<String> palabras = new HashSet<>();

        generadorPalabrasRandom(initArray, palabras);
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    private static void generadorPalabrasRandom(String[] letras, Set<String> palabras) {

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if (i == j) {
                    palabras.add(letras[i]);
                }
                palabras.add(letras[i] + letras[j]);
            }
        }
    }
    }
