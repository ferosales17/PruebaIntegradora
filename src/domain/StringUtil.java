package domain;

import java.util.HashMap;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    public static String replicate(char c, int n) {
        String cadena = "";
        StringBuilder strnbl = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            strnbl.append(String.valueOf(c));
            cadena = String.valueOf(strnbl);
        }
        //System.out.println(cadena);
        return cadena;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    public static String lpad(String s, int n, char c) {
        String cadena = "";
        StringBuilder strnbl = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            strnbl.append(String.valueOf(c));
            cadena = String.valueOf(strnbl) + s;
        }
        return cadena;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String arrStrg[] = new String[arr.length];
        String charS;
        for (int i = 0; i < arr.length; i++) {
            charS = String.valueOf(arr[i]);
            arrStrg[i] = charS;
        }
        return arrStrg;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int arrInt[] = new int[arr.length];
        int a;
        for (int i = 0; i < arr.length; i++) {
            a = i;
            arrInt[i] = a;
            System.out.println("Elemento = " + arrInt[i]);
        }
        return arrInt;
    }


    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int max = 0, min = 0, cont = 0;
        for (int i = 0; i < arr.length; i++) {
            String nombre = arr[i];
            for (int j = 0; j < nombre.length(); j++) {
                cont++;
            }
            if (cont < min) {
                min = cont;
                cont = 0;
            } else if (cont > max) {
                max = cont;
                cont = 0;
            } else {
                min = cont;
                cont = 0;
            }
        }
        return max;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int max = 0, min = 0, cont = 0;
        int maximo = maxLength(arr); // me trae el maximo de los elemntos
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            String nombre = arr[i];
            for (int j = 0; j < nombre.length(); j++) {
                count2++;
            }
            String agregar;
            int elementoQ = count2;
            count2 = 0;
            if (maximo != elementoQ) {
                int resto = maximo - elementoQ;
                agregar = replicate(c, resto);
                nombre = nombre + agregar;
            }
            System.out.println("Numero = " + nombre + " con Tamaño = " + nombre.length());
        }
    }

    public static String[] normalizeWithZeroLeft(String arr[], char c) {
        String nArrg[] = new String[arr.length];
        int max = 0, min = 0, cont = 0;
        int maximo = maxLength(arr); // me trae el maximo de los elemntos
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            String nombre = arr[i];
            for (int j = 0; j < nombre.length(); j++) {
                count2++;
            }
            String agregar;
            int elementoQ = count2;
            count2 = 0;
            if (maximo != elementoQ) {
                int resto = maximo - elementoQ;
                agregar = replicate(c, resto);
                nombre = agregar + nombre;
            }
            nArrg[i] = nombre;
        }
        return nArrg;
    }


    public static HashMap<String, String> lastDigit(String[] a) {
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String elem = a[i];
            String uP = elem.substring(elem.length() - 1);
            hm.put(elem,uP);
        }
        return hm;
    }

    public static HashMap<String, String> anteUltimoDigito(String[] a) {
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String elem = a[i];
            String uP = elem.substring(elem.length() - 2,elem.length() - 1);
            hm.put(elem,uP);
        }
        return hm;
    }

    public static HashMap<String, String> firstDigit(String[] a) {
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < a.length;i++) {
            String elem = a[i];
            String uP = elem.substring(0,elem.length() - 2);
            hm.put(elem,uP);
        }
        return hm;
    }

}
