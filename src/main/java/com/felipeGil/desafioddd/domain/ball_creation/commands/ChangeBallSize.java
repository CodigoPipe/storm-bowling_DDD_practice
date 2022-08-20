package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;

public class ChangeBallSize extends Command{

    private final BallCreationId ballCreationId;

    private final CompactingMachineId compactingMachineId;

    private final BallSize ballSize;

    public ChangeBallSize(BallCreationId ballCreationId, CompactingMachineId compactingMachineId, BallSize ballSize) {
        this.ballCreationId = ballCreationId;
        this.compactingMachineId = compactingMachineId;
        this.ballSize = ballSize;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public CompactingMachineId getCompactingMachineId() {
        return compactingMachineId;
    }

    public BallSize getBallSize() {
        return ballSize;
    }
}
