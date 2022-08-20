package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Material implements ValueObject<String>{

    private final String value;

    public Material(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Material cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Material cant have less than 3 letters");
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
        Material material = (Material) o;
        return Objects.equals(value, material.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
