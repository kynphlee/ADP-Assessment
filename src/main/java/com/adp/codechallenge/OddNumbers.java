package com.adp.codechallenge;

import java.util.ArrayList;

/**
 * Created by kynphlee on 1/24/17.
 */
public class OddNumbers {
    public static void main(String[] args) {
        Integer[] oddNumbers = oddNumbers(7, 10, 23, -2017, 143, -74, -25, 67, 75, 200);

        System.out.println("Odd Numbers:");
        for(Integer odd: oddNumbers) {
            System.out.println(odd);
        }
    }

    public static Integer[] oddNumbers(Integer... input) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        findOddNumbers(input, oddNumbers, 0);

        return oddNumbers.toArray(new Integer[0]);
    }

    private static void findOddNumbers(Integer[] numbers, ArrayList<Integer> odd, int index) {

        if (index == numbers.length) {
            return;
        } else if ((numbers[index] & 1) != 0) {
            odd.add(numbers[index]);
            findOddNumbers(numbers, odd, ++index);
        } else {
            findOddNumbers(numbers, odd, ++index);
        }
    }
}
