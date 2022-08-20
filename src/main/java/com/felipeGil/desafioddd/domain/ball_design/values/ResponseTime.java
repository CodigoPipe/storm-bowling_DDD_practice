package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class ResponseTime  implements ValueObject<Integer> {

    private final Integer value;

    public ResponseTime(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value <= 0 ){
            throw new IllegalArgumentException("The Value Object response time cant be less than 0");
        }
        if(this.value > 10 ){
            throw new IllegalArgumentException("The Value Object response time cant be more than 10");
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
        ResponseTime responseTime = (ResponseTime) o;
        return Objects.equals(value, responseTime.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
