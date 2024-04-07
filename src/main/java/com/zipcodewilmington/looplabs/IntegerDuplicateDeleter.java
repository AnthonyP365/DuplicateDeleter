package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int index = 0;
        Integer[] result = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            int duplicates = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates++;
                }
            }
            if (duplicates < maxNumberOfDuplications) {
                result[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int index = 0;
        Integer[] result = new Integer[array.length];

        for (int i = 0; i < array.length; i++) { // Iterate through given array and count the duplicates of the given number
            int duplicates = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates++;
                }
            }
            if (duplicates != exactNumberOfDuplications) {
                result[index] = array[i];
                index++;
                }
        }
        return Arrays.copyOf(result, index);
    }
}
