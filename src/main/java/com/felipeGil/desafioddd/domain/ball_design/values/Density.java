package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Density implements ValueObject<Integer> {

    private final Integer value;

    public Density(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value <= 0 ){
            throw new IllegalArgumentException("The Value Object Density cant be less or equalsto 0");
        }
        if(this.value > 100 ){
            throw new IllegalArgumentException("The Value Object Density cant be more than 100");
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
        Density density = (Density) o;
        return Objects.equals(value, density.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

