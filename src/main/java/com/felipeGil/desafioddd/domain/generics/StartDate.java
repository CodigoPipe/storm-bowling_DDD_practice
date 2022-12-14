package com.felipeGil.desafioddd.domain.generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class StartDate implements ValueObject<String> {

    private final String value;

    public StartDate(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO start date cant be blank");
        }
        if(this.value.length() < 8){
            throw new IllegalArgumentException("The VO start date cant have less than 8 letters");
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
        StartDate startDate = (StartDate) o;
        return Objects.equals(value, startDate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
