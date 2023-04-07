package homework3.Task;


import java.util.Arrays;

public class Task1 {
    public static int[] doMergeSort(int[] array) {
        // условия выхода

        if (array == null) {
            return null;
        }
        if (array.length <= 1) {
            return array;
        }

        // деление массива

        int[] first = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] second = Arrays.copyOfRange(array, first.length, array.length);

        first = doMergeSort(first);
        second = doMergeSort(second);


        return doMerge(first, second);
    }

    public static int[] doMerge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int resInd = 0, fInd = 0, sInd = 0;

        while (fInd < first.length && sInd < second.length) {
            if (first[fInd] < second[sInd]){
                result[resInd++] = first[fInd++];
            }
            else {
                result[resInd++] = second[sInd++];
            }
//            если остались элем-ы, добавляем их в резалт без сортировки

            while (resInd < result.length) {
                if (fInd < first.length) {
                    result[resInd++] = first[fInd++];
                }
                else {
                    result[resInd++] = second[sInd++];
                }
            }
        }
        return result;
    }


}
