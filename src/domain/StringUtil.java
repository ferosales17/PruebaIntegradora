package domain;

import java.util.HashMap;
import java.util.HashSet;

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
        //Implementación
        String cadena = "";
        StringBuilder strnbl = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            strnbl.append(String.valueOf(c));
            cadena = String.valueOf(strnbl) + s;
        }
        //System.out.println(cadena);
        return cadena;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        //Implementación
        String arrStrg[] = new String[arr.length];
        String charS;
        for (int i = 0; i < arr.length; i++) {
            charS = String.valueOf(arr[i]);
            arrStrg[i] = charS;
            System.out.println(i + " = " + arrStrg[i]);
        }
        return arrStrg;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        //Implementación
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
        //Implementación
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
        //Implementación
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
            System.out.println("Numero = " + nombre + " con Tamaño = " + nombre.length());
            nArrg[i] = nombre;
        }
        return nArrg;
    }


    public static HashMap<String, String> ultimoDigito(String[] a) {
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String elem = a[i];
            String uP = elem.substring(elem.length() - 1);
            //System.out.println("uP = " + uP);
            hm.put(uP, elem);
            //System.out.println("uP = " + uP);
            //System.out.println(" hm = " + hm.get(uP));
            //System.out.println(" el = " +hm);
        }
        return hm;
    }

    public static HashMap<String, String> anteUltimoDigito(String[] a) {
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String elem = a[i];
            String uP = elem.substring(elem.length() - 2);
            System.out.println("uP = " + uP);
            hm.put(uP, elem);
        }
        return hm;
    }

    public static HashMap<String, String> antePenultimoDigito(String[] a) {
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String elem = a[i];
            String uP = elem.substring(elem.length() - 3);
            System.out.println("uP = " + uP);
            hm.put(uP, elem);
        }
        return hm;
    }

}
