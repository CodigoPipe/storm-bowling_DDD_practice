package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class CreateBallCreation extends Command {

    private final BallCreationId ballCreationId;

    private final StartDate startDate;

    private final EndDate endDate;

    public CreateBallCreation(BallCreationId ballCreationId, StartDate startDate, EndDate endDate) {
        this.ballCreationId = ballCreationId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
