package com.felipeGil.desafioddd.domain.ball_creation.values;

import co.com.sofka.domain.generic.Identity;

public class BallCreationId extends Identity{

    public BallCreationId() {

    }

    private BallCreationId(String id){
        super(id);
    }

    public static BallCreationId of(String id){
        return new BallCreationId(id);
    }
}
