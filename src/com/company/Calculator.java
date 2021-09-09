package com.company;

import java.util.Objects;

public class Calculator {
    int in;
    int two;

    public Calculator(int in, int two) {
        this.in = in;
        this.two = two;
    }


    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public int sum(){
        return in + two;
    }

    @Override
    public String toString() {
        return "calculator" +
                "in=" + in + "; two=" + two;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return in == that.in;
    }

    @Override
    public int hashCode() {
        return Objects.hash(in);
    }
}
