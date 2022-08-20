package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.Identity;

public class CoreDesingId extends Identity{

    public CoreDesingId() {

    }

    private CoreDesingId(String id){
        super(id);
    }

    public static CoreDesingId of(String id){
        return new CoreDesingId(id);
    }
}
