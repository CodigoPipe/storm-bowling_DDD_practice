package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class FixStartDateOfBallCreation extends Command{

    private final BallCreationId ballCreationId;

    private final StartDate startDate;

    public FixStartDateOfBallCreation(BallCreationId ballCreationId, StartDate startDate) {
        this.ballCreationId = ballCreationId;
        this.startDate = startDate;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public StartDate getStartDate() {
        return startDate;
    }
}
