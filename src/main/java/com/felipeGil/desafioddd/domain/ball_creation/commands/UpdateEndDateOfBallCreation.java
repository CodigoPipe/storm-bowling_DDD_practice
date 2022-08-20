package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.generics.EndDate;

public class UpdateEndDateOfBallCreation extends Command{

    private final BallCreationId ballCreationId;

    private final EndDate endDate;

    public UpdateEndDateOfBallCreation(BallCreationId ballCreationId, EndDate endDate) {
        this.ballCreationId = ballCreationId;
        this.endDate = endDate;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
