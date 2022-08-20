package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorName;
import com.felipeGil.desafioddd.domain.ball_design.values.Density;

public class ColorDesingAdded extends DomainEvent {

    private final ColorDesingId colorDesingId;

    private final ColorName colorName;

    private final Density density;

    public ColorDesingAdded(ColorDesingId colorDesingId, ColorName colorName, Density density) {
        super("FelipeGil.BallDesing.ColorDesingAdded");
        this.colorDesingId = colorDesingId;
        this.colorName = colorName;
        this.density = density;
    }

    public ColorDesingId getColorDesingId() {
        return colorDesingId;
    }

    public ColorName getColorName() {
        return colorName;
    }

    public Density getDensity() {
        return density;
    }
}
