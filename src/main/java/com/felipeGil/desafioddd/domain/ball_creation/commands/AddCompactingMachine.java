package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Material;

public class AddCompactingMachine extends Command {

    private final BallCreationId ballCreationId;

    private final CompactingMachineId compactingMachineId;

    private final BallSize ballSize;

    private final Material material;

    public AddCompactingMachine(BallCreationId ballCreationId, CompactingMachineId compactingMachineId, BallSize ballSize, Material material) {
        this.ballCreationId = ballCreationId;
        this.compactingMachineId = compactingMachineId;
        this.ballSize = ballSize;
        this.material = material;
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

    public Material getMaterial() {
        return material;
    }
}
