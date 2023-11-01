package org.Learning;

import java.util.stream.IntStream;

/* Converting loops with steps */
public class ConvertingLoopsWithSteps {
    public static void main(String[] args) {
        /* Iterative style to skips steps */
        for (int i = 0; i < 15; i = i + 3)
            System.out.println(i);

        /* Functional style to skip steps */
        IntStream.iterate(0, i -> i < 15, i -> i + 3).forEach(System.out::println);

        /* Iterative style to Unbounded iteration with break */
        for (int i = 0; ; i = i + 3) {
            if (i > 20)
                break;
            System.out.println(i);
        }

        /* Functional style to unbound iteration alternative to break */
        /* takwhile is equivalent to Imperative break */
        IntStream.iterate(0, i -> i + 3).takeWhile(i -> i <= 20).forEach(System.out::println);

    }
}
