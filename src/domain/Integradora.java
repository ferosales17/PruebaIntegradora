package domain;


import static domain.RadixSort.radixSort;
import static domain.StringUtil.*;

public class Integradora {
    public static void main(String[] args) {
        int iArr[] = {3, 673, 106, 45, 2, 23};
        radixSort(iArr);

        int iArrP[] = {16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(iArrP);
    }
}


