package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorName;
import com.felipeGil.desafioddd.domain.ball_design.values.Density;

public class AddColorDesing extends Command{

    private final BallDesingId ballDesingId;

    private final ColorDesingId entityId;

    private final ColorName colorName;

    private final Density density;

    public AddColorDesing(BallDesingId ballDesingId, ColorDesingId entityId, ColorName colorName, Density density) {
        this.ballDesingId = ballDesingId;
        this.entityId = entityId;
        this.colorName = colorName;
        this.density = density;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public ColorDesingId getEntityId() {
        return entityId;
    }

    public ColorName getColorName() {
        return colorName;
    }

    public Density getDensity() {
        return density;
    }
}
