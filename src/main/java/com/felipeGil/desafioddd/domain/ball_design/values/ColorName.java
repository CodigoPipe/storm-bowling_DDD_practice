package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ColorName implements ValueObject<String>{

    private final String value;

    public ColorName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The Value Object color name cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO location cant have less than 3 letters");
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
        ColorName colorName = (ColorName) o;
        return Objects.equals(value, colorName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
