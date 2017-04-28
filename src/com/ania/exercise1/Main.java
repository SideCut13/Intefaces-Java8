/**
 * Created by Anna Zdrojewska on 2017-04-28.
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 */
package com.ania.exercise1;

import java.util.Arrays;
import java.util.function.Function;

public class Main {

    //method that takes Integer array and functional interface as arguments
    public static Integer[] method(Integer array[], Function<Integer, Integer> f){
        //create a result array with the same length as input array
        Integer[] resultArray = new Integer[array.length];
        //conversion of array elements with functional interface, result is in result array
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = f.apply(array[i]);
        }
        return resultArray;
    }

    //function that returns a second largest divisor less input value
    private static int secondDivisor(int x) {
        for (int i = x/2; i > 1; --i) {
            if (x % i == 0) {
                return i;
            }
        }
        //when we have a prime number then return 1
        return 1;
    }

    public static void main(String[] args) {
        //an Integer array with random values
        Integer array[] = {30,4,25,12,21,33,7};
        //transfer new Integer array to a method, the second argument is an implementation of functional interface
        //that transfer value into second divisor (look up -> function secondDivisor)
        Integer[] newArray = method(array, f -> secondDivisor(f));
        //show output array after transformation
        System.out.println(Arrays.toString(newArray));
    }
}
