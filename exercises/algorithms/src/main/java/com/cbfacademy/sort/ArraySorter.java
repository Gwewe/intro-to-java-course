package com.cbfacademy.sort;

import java.util.ArrayList;


/**
 * Represents a class that can sort array elements
 */

public interface ArraySorter {
    /**
     * Sorts an array
     * @param arr The array to be sorted.
     * @param startIndex The index of the start element
     * @param endIndex The index of the end element
     */
    void sort(int[] arr, int startIndex, int endIndex);
}