package domain;

import java.util.*;

import static domain.StringUtil.*;

public class RadixSort {
    public static void radixSort(int[] arr) {
        HashMap<String, String> mapListLastDigit = new HashMap<>();

        //Implementación
        String arrStrg[] = toStringArray(arr); // 1- convierto el arreglo de enteros en string
        String normARR[] = normalizeWithZeroLeft(arrStrg, '0'); // 2- relleno elementos con 0 para tener el mismo tamaño


        // ultimo digito
        System.out.println("Listas con Ultimo digito:");
        mapListLastDigit = ultimoDigito(normARR);
        callLists(mapListLastDigit);

    }

    // funcion llamo listas
    public static void callLists(HashMap<String, String> mapList) {
        // Iniciamos las listas
        List L0 = new ArrayList();
        List L1 = new ArrayList();
        List L2 = new ArrayList();
        List L3 = new ArrayList();
        List L4 = new ArrayList();
        List L5 = new ArrayList();
        List L6 = new ArrayList();
        List L7 = new ArrayList();
        List L8 = new ArrayList();
        List L9 = new ArrayList();
        for (Map.Entry<String, String> entry : mapList.entrySet()) {
            if (entry.getKey().equals("0")) {
                L0.add(entry.getValue());
                System.out.println("L0 = " + L0);
            } else if (entry.getKey().equals("1")) {
                L1.add(entry.getValue());
                System.out.println("L1 = " + L1);
            } else if (entry.getKey().equals("2")) {
                L2.add(entry.getValue());
                System.out.println("L2 = " + L2);
            } else if (entry.getKey().equals("3")) {
                L3.add(entry.getValue());
                System.out.println("L3 = " + L3);
            } else if (entry.getKey().equals("4")) {
                L4.add(entry.getValue());
                System.out.println("L4 = " + L4);
            } else if (entry.getKey().equals("5")) {
                L5.add(entry.getValue());
                System.out.println("L5 = " + L5);
            } else if (entry.getKey().equals("6")) {
                L6.add(entry.getValue());
                System.out.println("L6 = " + L6);
            } else if (entry.getKey().equals("7")) {
                L7.add(entry.getValue());
                System.out.println("L7 = " + L7);
            } else if (entry.getKey().equals("8")) {
                L8.add(entry.getValue());
                System.out.println("L8 = " + L8);
            } else if (entry.getKey().equals("9")) {
                L9.add(entry.getValue());
                System.out.println("L8 = " + L9);
            }
        }
    }


}

