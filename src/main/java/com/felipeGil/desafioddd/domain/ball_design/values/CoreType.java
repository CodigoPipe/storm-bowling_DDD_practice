package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CoreType implements ValueObject<String>{

    private final String value;

    public CoreType(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Core type cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Core type cant have less than 3 letters");
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
        CoreType coreType = (CoreType) o;
        return Objects.equals(value, coreType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
