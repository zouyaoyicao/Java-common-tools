package java.com.zeroten.common.util.CheckUtils;

public class ArrayUtilsTest {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length == 1)
            return arr;
        for (int i = 0; i<arr.length-2 ; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
