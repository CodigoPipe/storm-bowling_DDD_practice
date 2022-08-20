package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.Density;

public class DecreaseDensity extends Command{

    private final BallDesingId ballDesingId;

    private final ColorDesingId colorDesingId;

    private final Density density;

    public DecreaseDensity(BallDesingId ballDesingId, ColorDesingId colorDesingId, Density density) {
        this.ballDesingId = ballDesingId;
        this.colorDesingId = colorDesingId;
        this.density = density;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public ColorDesingId getColorDesingId() {
        return colorDesingId;
    }

    public Density getDensity() {
        return density;
    }
}
