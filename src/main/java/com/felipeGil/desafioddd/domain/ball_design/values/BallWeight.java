package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BallWeight implements ValueObject<Integer>{

    private final Integer value;

    public BallWeight(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 6){
            throw new IllegalArgumentException("The Value Object Ball weight cant be less than 6 kg");
        }
        if(this.value > 16 ){
            throw new IllegalArgumentException("The Value Object Ball weight cant be more than 16 kg");
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
        BallWeight ballWeight = (BallWeight) o;
        return Objects.equals(value, ballWeight.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
