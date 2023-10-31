package org.Learning;

/* Converting Simple loops to Functional style */

import java.util.stream.IntStream;

public class ConvertingSimpleLoops {
    public static void main(String[] args) {
        /* Imperative style loop */
        for (int i = 0; i < 5; i++)
            System.out.println(i);

        /* Function style */
        IntStream.range(0, 5).forEach(System.out::println);

        /* Imperative style loop including the end value */
        for (int i = 0; i <= 5; i++)
            System.out.println(i);

        /* Functional style code including the end value */
        IntStream.rangeClosed(0,5).forEach(System.out::println);

    }

}
