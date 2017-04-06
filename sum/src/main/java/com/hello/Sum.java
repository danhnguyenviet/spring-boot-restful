package com.hello;

/**
 * Created by Danh on 4/6/2017.
 */
public class Sum {

    private final Integer a;
    private final Integer b;
    private final Integer sum;

    public Sum() {
        a = null;
        b = null;
        sum = null;
    }

    public Sum(Integer a, Integer b, Integer sum) {
        this.a = a;
        this.b = b;
        this.sum = sum;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getSum() {
        return this.sum;
    }
}
