package com.felipeGil.desafioddd.domain.generics;

import co.com.sofka.domain.generic.ValueObject;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverType;

import java.util.Objects;

public class EndDate implements ValueObject<String>{

    private final String value;

    public EndDate(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO End date cant be blank");
        }
        if(this.value.length() < 8){
            throw new IllegalArgumentException("The VO End date cant have less than 8 letters");
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
        EndDate endDate = (EndDate) o;
        return Objects.equals(value, endDate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
