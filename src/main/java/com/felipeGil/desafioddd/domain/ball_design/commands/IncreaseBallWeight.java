package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.BallWeight;

public class IncreaseBallWeight extends Command{

    private final BallDesingId ballDesingId;

    private final BallWeight ballWeight;

    public IncreaseBallWeight(BallDesingId ballDesingId, BallWeight ballWeight) {
        this.ballDesingId = ballDesingId;
        this.ballWeight = ballWeight;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public BallWeight getBallWeight() {
        return ballWeight;
    }
}
