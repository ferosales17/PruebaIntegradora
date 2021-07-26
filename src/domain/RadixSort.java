package domain;

import java.util.*;

import static domain.StringUtil.*;

public class RadixSort {
    public static void radixSort(int []arr)
    {
        HashMap<String, String> mapList = new HashMap<>();

        //Implementación
        String arrStrg[] = toStringArray(arr); // 1- convierto el arreglo de enteros en string
        String normARR[] = normalizeWithZeroLeft(arrStrg,'0'); // 2- relleno elementos con 0 para tener el mismo tamaño

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

        // ultimo digito
        System.out.println("Ultimo digito");
        mapList = ultimoDigito(normARR);
        for (Map.Entry<String, String> entry:mapList.entrySet()) {
             if(entry.getKey().equals("2")){
                 //String valor = String.valueOf(entry.getValue());
                 //L2.add(entry.getValue());
                 System.out.println("valor = " + entry.getValue());
                 //System.out.println("L2 = " + L2);
             }else if(entry.getKey().equals("2")){
                 //String valor = String.valueOf(entry.getValue());
                 //L3.add(entry.getValue());
                 System.out.println("valor = " + entry.getValue());
                 //System.out.println("L3 = " + L3);
             }


             }

        }

    }

