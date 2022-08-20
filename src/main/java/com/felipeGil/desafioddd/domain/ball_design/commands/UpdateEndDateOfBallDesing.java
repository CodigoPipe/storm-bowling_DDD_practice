package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.generics.EndDate;

public class UpdateEndDateOfBallDesing extends Command{

    private final BallDesingId ballDesingId;

    private final EndDate endDate;

    public UpdateEndDateOfBallDesing(BallDesingId ballDesingId, EndDate endDate) {
        this.ballDesingId = ballDesingId;
        this.endDate = endDate;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public EndDate getEndDate() {
        return endDate;
    }
    
}
