package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Salary implements ValueObject<Integer>{

    private final Integer value;

    public Salary(Integer value) {

        this.value = Objects.requireNonNull(value);
        if(this.value < 1500 ){
            throw new IllegalArgumentException("The Value Object Salary cant be less than 1");
        }

    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary  = (Salary) o;
        return Objects.equals(value, salary.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
