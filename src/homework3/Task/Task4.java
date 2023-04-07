// *Реализовать разность массивов и симметрическую разность. To realize the difference of arrays and the symmetric difference.

package homework3.Task;

import java.util.Arrays;

public class Task4 {
    public static void showArraysDifference() {
        int[] arr1 = new int[]{4, 2, 45, 4, 7, 6};
        int[] arr2 = new int[]{4, 11, 6, 7, 88, 9};
        int[] diff = new int[arr1.length];
        int[] sdiff = new int[arr1.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    sdiff[i] = arr1[i];
                }
                else if (arr1[i] != arr2[j]) {
                    count += 1;
                }

            }
            if (count == arr1.length) {
                diff[i] = arr1[i];
            }
            count = 0;

            }
        System.out.println(Arrays.toString(diff));

        }












}
