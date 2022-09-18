package Fundamentals.task5.Control;

public class ElementsKickControl {
    public int findLeastK(int[] arr) {
        if (arr == null || arr.length == 0) throw new RuntimeException("Array must be initialized with numers!");

        int n = arr.length;
        int length = 0;

        int[] extraArr = initSupArr(n + 1);

        for (int i = 0; i < n; i++) {
            int j = binarySearch(extraArr, 0, n, arr[i]);
            if (extraArr[j - 1] < arr[i] && arr[i] < extraArr[j]) {
                extraArr[j] = arr[i];
                length = Math.max(length, j);
            }
        }
        return n - length;
    }

    private int[] initSupArr(int n) {
        int[] supArr = new int[n];
        supArr[0] = Integer.MIN_VALUE;
        for (int i = 1; i < supArr.length; i++) {
            supArr[i] = Integer.MAX_VALUE;
        }
        return supArr;
    }

    private int binarySearch(int[] arr, int l, int r, int sElem) {
        int m = -1;
        if (sElem < arr[l])
            return l;
        if (sElem > arr[r])
            return r;
        while (l <= r) {
            m = (l + r) / 2;
            if (sElem >= arr[m] && sElem < arr[m + 1])
                return m + 1;
            if (sElem < arr[m])
                r = m - 1;
            if (sElem > arr[m])
                l = m + 1;
        }
        return m;
    }
}