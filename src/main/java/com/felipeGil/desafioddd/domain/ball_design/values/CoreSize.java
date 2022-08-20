package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CoreSize implements ValueObject<Integer> {

    private final Integer value;

    public CoreSize(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 500 ){
            throw new IllegalArgumentException("The Value Object Core size cant be less than 500");
        }
        if(this.value > 2500 ){
            throw new IllegalArgumentException("The Value Object Core size cant be more than 2500");
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
        CoreSize coreSize = (CoreSize) o;
        return Objects.equals(value, coreSize.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
