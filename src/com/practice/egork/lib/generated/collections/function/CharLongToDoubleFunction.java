package com.practice.egork.lib.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface CharLongToDoubleFunction {
    public double value(char first, long second);

    default public CharToDoubleFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default public LongToDoubleFunction setFirst(char first) {
        return v -> value(first, v);
    }
}
