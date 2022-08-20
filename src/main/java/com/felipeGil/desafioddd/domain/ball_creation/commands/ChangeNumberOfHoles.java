package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.DrillingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.NumerOfHoles;

public class ChangeNumberOfHoles extends Command {

    private final BallCreationId ballCreationId;

    private final DrillingMachineId drillingMachineId;

    private final NumerOfHoles numerOfHoles;

    public ChangeNumberOfHoles(BallCreationId ballCreationId, DrillingMachineId drillingMachineId, NumerOfHoles numerOfHoles) {
        this.ballCreationId = ballCreationId;
        this.drillingMachineId = drillingMachineId;
        this.numerOfHoles = numerOfHoles;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public DrillingMachineId getDrillingMachineId() {
        return drillingMachineId;
    }

    public NumerOfHoles getNumerOfHoles() {
        return numerOfHoles;
    }
}
