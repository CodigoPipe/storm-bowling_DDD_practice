package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorName;

public class ColorNameChanged extends DomainEvent {

    private final ColorDesingId colorDesingId;

    private final ColorName colorName;

    public ColorNameChanged(ColorDesingId colorDesingId, ColorName colorName) {
        super("FelipeGil.BallDesing.ColorNameChanged");
        this.colorDesingId = colorDesingId;
        this.colorName = colorName;
    }

    public ColorDesingId getColorDesingId() {
        return colorDesingId;
    }

    public ColorName getColorName() {
        return colorName;
    }
}
