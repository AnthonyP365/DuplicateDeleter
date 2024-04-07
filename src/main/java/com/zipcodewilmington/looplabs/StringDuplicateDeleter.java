package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int index = 0;
        String[] result = new String[array.length];

// Iterates through the array and counts the number of duplicates
        for (int i = 0; i < array.length; i++) {
            int duplicates = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates++;
                }
            }
// If the amount of duplicates for an element are lower than the max allowed, add element to new array and increment the new array's index
            if (duplicates < maxNumberOfDuplications) {
                result[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int index = 0;
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
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
