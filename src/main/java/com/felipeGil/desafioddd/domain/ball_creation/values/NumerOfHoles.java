package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumerOfHoles implements ValueObject<Integer>{

    private final Integer value;

    public NumerOfHoles(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 2 ){
            throw new IllegalArgumentException("The Value Object number of holes cant be less than 2");
        }
        if(this.value > 5 ){
            throw new IllegalArgumentException("The Value Object number of holes cant be more than 5");
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
        NumerOfHoles numerOfHoles  = (NumerOfHoles) o;
        return Objects.equals(value, numerOfHoles.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
