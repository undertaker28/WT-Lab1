package Fundamentals.task8.Control;

public class ElementsInsertControl {
    public int[] getPositionsToInsert(double arrA[], double arrB[]) {
        if (arrA == null || arrA.length == 0) throw new RuntimeException("Array A must be initialized with numers!");
        if (arrB == null || arrB.length == 0) throw new RuntimeException("Array must be initialized with numers!");
        if (!isGrowing(arrA)) throw new RuntimeException("Array A must be uprising!");
        if (!isGrowing(arrB)) throw new RuntimeException("Array B must be uprising!");

        int[] positions = new int[arrB.length];
        for (int i = 0; i < arrB.length; i++) {
            positions[i] = binarySearch(arrA, 0, arrA.length - 1, arrB[i]);
        }
        return positions;
    }

    private boolean isGrowing(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    private int binarySearch(double[] arr, int l, int r, double sElem) {
        int m = -1;
        if (sElem <= arr[l])
            return l;
        if (sElem >= arr[r])
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