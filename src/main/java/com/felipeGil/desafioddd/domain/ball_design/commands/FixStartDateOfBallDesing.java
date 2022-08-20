package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class FixStartDateOfBallDesing extends Command{

    private final BallDesingId ballDesingId;

    private final StartDate startDate;

    public FixStartDateOfBallDesing(BallDesingId ballDesingId, StartDate startDate) {
        this.ballDesingId = ballDesingId;
        this.startDate = startDate;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public StartDate getStartDate() {
        return startDate;
    }

}
