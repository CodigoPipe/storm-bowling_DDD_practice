package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.DrillingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.HoleSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.NumerOfHoles;

public class AddDrillingMachine extends Command{

    private final BallCreationId ballCreationId;

    private final DrillingMachineId drillingMachineId;

    private final HoleSize holeSize;

    private final NumerOfHoles numerOfHoles;

    public AddDrillingMachine(BallCreationId ballCreationId, DrillingMachineId drillingMachineId, HoleSize holeSize, NumerOfHoles numerOfHoles) {
        this.ballCreationId = ballCreationId;
        this.drillingMachineId = drillingMachineId;
        this.holeSize = holeSize;
        this.numerOfHoles = numerOfHoles;
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

    public NumerOfHoles getNumerOfHoles() {
        return numerOfHoles;
    }
}
