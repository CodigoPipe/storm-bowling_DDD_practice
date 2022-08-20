package com.felipeGil.desafioddd.domain.ball_design.values;

import co.com.sofka.domain.generic.Identity;

public class ColorDesingId extends Identity{

    public ColorDesingId() {

    }

    private ColorDesingId(String id){
        super(id);
    }

    public static ColorDesingId of(String id){
        return new ColorDesingId(id);
    }

}
