package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MachineInCharge implements ValueObject<String>{

    private final String value;

    public MachineInCharge(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Machine in charge cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO Machine in charge cant have less than 3 letters");
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
        MachineInCharge machineInCharge = (MachineInCharge) o;
        return Objects.equals(value, machineInCharge.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
