package domain;

import java.util.*;

import static domain.StringUtil.*;

public class RadixSort {
    public static void radixSort(int[] arr) {
        HashMap<String, String> mapListLastDigit = new HashMap<>();
        HashMap<String, String> mapListBeforeLastDigit = new HashMap<>();
        HashMap<String, String> mapListFirstDigit = new HashMap<>();

        //Implementación
        String arrStrg[] = toStringArray(arr); // 1- convierto el arreglo de enteros en string
        String normARR[] = normalizeWithZeroLeft(arrStrg, '0'); // 2- relleno elementos con 0 para tener el mismo tamaño


        // ultimo digito
        System.out.println("LISTAS DE ULTIMO NUMERO:");
        mapListLastDigit = lastDigit(normARR);
        callLists(mapListLastDigit);
        System.out.println("LISTAS DEL ANTEULTIMO NUMERO:");
        mapListBeforeLastDigit = anteUltimoDigito(normARR);
        callLists(mapListBeforeLastDigit);
        System.out.println("LISTAS DEL PRIMER NUMERO:");
        mapListFirstDigit = firstDigit(normARR);
        callLists(mapListFirstDigit);

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
            if (entry.getValue().equals("0")) {
                L0.add(entry.getKey());
            } else if (entry.getValue().equals("1")) {
                L1.add(entry.getKey());
            } else if (entry.getValue().equals("2")) {
                L2.add(entry.getKey());
            } else if (entry.getValue().equals("3")) {
                L3.add(entry.getKey());
            } else if (entry.getValue().equals("4")) {
                L4.add(entry.getKey());
            } else if (entry.getValue().equals("5")) {
                L5.add(entry.getKey());
            } else if (entry.getValue().equals("6")) {
                L6.add(entry.getKey());
            } else if (entry.getValue().equals("7")) {
                L7.add(entry.getKey());
            } else if (entry.getValue().equals("8")) {
                L8.add(entry.getKey());
            } else if (entry.getValue().equals("9")) {
                L9.add(entry.getKey());
            }
        }
        System.out.println(" L0 contiene: " + L0);
        System.out.println(" L1 contiene: " + L1);
        System.out.println(" L2 contiene: " + L2);
        System.out.println(" L3 contiene: " + L3);
        System.out.println(" L4 contiene: " + L4);
        System.out.println(" L5 contiene: " + L5);
        System.out.println(" L6 contiene: " + L6);
        System.out.println(" L7 contiene: " + L7);
        System.out.println(" L8 contiene: " + L8);
        System.out.println(" L9 contiene: " + L9);

    }






}

