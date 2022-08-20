package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class BallSize implements ValueObject<String>{

    private final String value;

    public BallSize(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Ball size cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Ball size cant have less than 3 letters");
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
        BallSize ballSize = (BallSize) o;
        return Objects.equals(value, ballSize.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
