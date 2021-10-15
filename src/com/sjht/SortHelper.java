package com.sjht;

public class SortHelper {
    private SortHelper() {
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] arr, SortType sortType) {
        for (int i = 1; i < arr.length; i++) {
            // 升序
            if (sortType == SortType.ASC && arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            } else if (sortType == SortType.DESC && arr[i - 1].compareTo(arr[i]) < 0) {//  降序
                return false;
            }
        }
        return true;
    }
}
