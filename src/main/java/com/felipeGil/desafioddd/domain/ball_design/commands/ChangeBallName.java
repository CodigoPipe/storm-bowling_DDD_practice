package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.BallName;

public class ChangeBallName  extends Command{

    private final BallDesingId ballDesingId;

    private final BallName ballName;

    public ChangeBallName(BallDesingId ballDesingId, BallName ballName) {
        this.ballDesingId = ballDesingId;
        this.ballName = ballName;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public BallName getBallName() {
        return ballName;
    }
}
