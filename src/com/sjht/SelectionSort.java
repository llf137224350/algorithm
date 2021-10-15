package com.sjht;

/**
 * 选择排序
 */
public class SelectionSort {
    private SelectionSort() {

    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int minIndex;
        T tempValue;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex].compareTo(arr[j]) > 0) {
                    minIndex = j;
                }
            }
            tempValue = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tempValue;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("张三", 98.2),
                new Student("李四", 94.2),
                new Student("王五", 88.2)};
        sort(students);
        System.out.println(SortHelper.isSorted(students, SortType.ASC));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
