package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.Identity;

public class CoverDesingId extends Identity{

    public CoverDesingId() {

    }

    private CoverDesingId(String id){
        super(id);
    }

    public static CoverDesingId of(String id){
        return new CoverDesingId(id);
    }

}
