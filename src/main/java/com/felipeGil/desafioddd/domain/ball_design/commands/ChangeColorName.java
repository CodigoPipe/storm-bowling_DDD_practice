package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ColorName;

public class ChangeColorName extends Command{

    private final BallDesingId ballDesingId;

    private final ColorDesingId colorDesingId;

    private final ColorName colorName;

    public ChangeColorName(BallDesingId ballDesingId, ColorDesingId colorDesingId, ColorName colorName) {
        this.ballDesingId = ballDesingId;
        this.colorDesingId = colorDesingId;
        this.colorName = colorName;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public ColorDesingId getColorDesingId() {
        return colorDesingId;
    }

    public ColorName getColorName() {
        return colorName;
    }
}
