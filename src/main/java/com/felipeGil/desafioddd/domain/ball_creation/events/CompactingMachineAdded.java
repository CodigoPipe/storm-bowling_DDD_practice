package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Material;

public class CompactingMachineAdded extends DomainEvent {


    private final CompactingMachineId compactingMachineId;

    private final BallSize ballSize;

    private final Material material;

    public CompactingMachineAdded(CompactingMachineId compactingMachineId, BallSize ballSize, Material material) {
        super("FelipeGil.BallCreation.CompactingMachineAdded");
        this.compactingMachineId = compactingMachineId;
        this.ballSize = ballSize;
        this.material = material;
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
