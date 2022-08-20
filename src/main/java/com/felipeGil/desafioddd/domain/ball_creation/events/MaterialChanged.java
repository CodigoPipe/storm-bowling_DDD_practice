package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Material;

public class MaterialChanged extends DomainEvent {

    private final CompactingMachineId compactingMachineId;

    private final Material material;

    public MaterialChanged(CompactingMachineId compactingMachineId, Material material) {
        super("FelipeGil.BallCreation.MaterialChanged");
        this.compactingMachineId = compactingMachineId;
        this.material = material;
    }

    public CompactingMachineId getCompactingMachineId() {
        return compactingMachineId;
    }

    public Material getMaterial() {
        return material;
    }
}
