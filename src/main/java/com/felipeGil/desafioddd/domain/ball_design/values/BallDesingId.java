package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.Identity;

public class BallDesingId extends Identity{

    public BallDesingId() {

    }

    private BallDesingId(String id){
        super(id);
    }

    public static BallDesingId of(String id){
        return new BallDesingId(id);
    }
}
