package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.Identity;

public class DrillingMachineId extends Identity{

    public DrillingMachineId() {

    }

    private DrillingMachineId(String id){
        super(id);
    }

    public static DrillingMachineId of(String id){
        return new DrillingMachineId(id);
    }
}
