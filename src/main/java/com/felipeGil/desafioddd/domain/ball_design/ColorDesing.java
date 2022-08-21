package com.felipeGil.desafioddd.domain.ball_design;

import co.com.sofka.domain.generic.Entity;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorName;
import com.felipeGil.desafioddd.domain.ball_design.values.Density;

import java.util.Objects;

public class ColorDesing extends Entity<ColorDesingId> {


    private ColorName colorName;

    private Density density;

    public ColorDesing(ColorDesingId entityId, ColorName colorName, Density density) {
        super(entityId);
        this.colorName = colorName;
        this.density = density;
    }


    public void changeColorName(ColorName colorName){
        this.colorName = Objects.requireNonNull(colorName);
    }

    public void increaseDensity(Density density){
        this.density = Objects.requireNonNull(density);
    }

    public void decreaseDensity(Density density){
        this.density = Objects.requireNonNull(density);
    }

    public ColorName colorName(){
        return colorName;
    }

    public Density density(){
        return density;
    }


}
