package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Material;

public class ChangeMaterial extends Command{

    private final BallCreationId ballCreationId;

    private final CompactingMachineId compactingMachineId;

    private final Material material;

    public ChangeMaterial(BallCreationId ballCreationId, CompactingMachineId compactingMachineId, Material material) {
        this.ballCreationId = ballCreationId;
        this.compactingMachineId = compactingMachineId;
        this.material = material;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public CompactingMachineId getCompactingMachineId() {
        return compactingMachineId;
    }

    public Material getMaterial() {
        return material;
    }
}
