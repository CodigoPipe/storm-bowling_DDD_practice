package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.Density;

public class DensityIncreased extends DomainEvent {

    private final ColorDesingId colorDesingId;

    private final Density density;

    public DensityIncreased(ColorDesingId colorDesingId, Density density) {
        super("FelipeGil.BallDesing.DensityIncreased");
        this.colorDesingId = colorDesingId;
        this.density = density;
    }

    public ColorDesingId getColorDesingId() {
        return colorDesingId;
    }

    public Density getDensity() {
        return density;
    }
}
