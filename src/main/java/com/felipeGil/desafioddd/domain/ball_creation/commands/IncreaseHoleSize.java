package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.DrillingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.HoleSize;

public class IncreaseHoleSize extends Command {

    private final BallCreationId ballCreationId;

    private final DrillingMachineId drillingMachineId;

    private final HoleSize holeSize;

    public IncreaseHoleSize(BallCreationId ballCreationId, DrillingMachineId drillingMachineId, HoleSize holeSize) {
        this.ballCreationId = ballCreationId;
        this.drillingMachineId = drillingMachineId;
        this.holeSize = holeSize;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public DrillingMachineId getDrillingMachineId() {
        return drillingMachineId;
    }

    public HoleSize getHoleSize() {
        return holeSize;
    }

}
