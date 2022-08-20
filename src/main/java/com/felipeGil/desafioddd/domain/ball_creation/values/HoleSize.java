package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HoleSize implements ValueObject<Integer>{

    private final Integer value;

    public HoleSize(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 1 ){
            throw new IllegalArgumentException("The Value Object Hole size cant be less than 1");
        }
        if(this.value > 10 ){
            throw new IllegalArgumentException("The Value Object hole size cant be more than 10");
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
        HoleSize holeSize  = (HoleSize) o;
        return Objects.equals(value, holeSize.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
