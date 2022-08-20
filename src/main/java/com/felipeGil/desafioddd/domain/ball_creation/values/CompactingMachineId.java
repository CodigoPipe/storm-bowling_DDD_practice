package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.Identity;

public class CompactingMachineId extends Identity{

    public CompactingMachineId() {

    }

    private CompactingMachineId(String id){
        super(id);
    }

    public static CompactingMachineId of(String id){
        return new CompactingMachineId(id);
    }
}
