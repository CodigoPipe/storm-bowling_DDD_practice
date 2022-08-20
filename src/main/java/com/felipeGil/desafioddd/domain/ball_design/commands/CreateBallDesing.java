package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.BallName;
import com.felipeGil.desafioddd.domain.ball_design.values.BallWeight;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class CreateBallDesing extends Command{

    private final BallDesingId ballDesingId;

    private final BallName ballName;

    private final BallWeight ballWeight;

    private final StartDate startDate;

    private final EndDate endDate;

    public CreateBallDesing(BallDesingId ballDesingId, BallName ballName, BallWeight ballWeight, StartDate startDate, EndDate endDate) {
        this.ballDesingId = ballDesingId;
        this.ballName = ballName;
        this.ballWeight = ballWeight;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public BallName getBallName() {
        return ballName;
    }

    public BallWeight getBallWeight() {
        return ballWeight;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
