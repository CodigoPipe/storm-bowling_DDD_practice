package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Surface implements ValueObject<String>{

    private final String value;

    public Surface(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Surface cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Surface cant have less than 3 letters");
        }
    }


    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Surface surface = (Surface) o;
        return Objects.equals(value, surface.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
