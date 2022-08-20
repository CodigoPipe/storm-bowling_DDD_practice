package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.DrillingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.HoleSize;

public class HoleSizeDecreased extends DomainEvent {

    private final DrillingMachineId drillingMachineId;

    private final HoleSize holeSize;

    public HoleSizeDecreased(DrillingMachineId drillingMachineId, HoleSize holeSize) {
        super("FelipeGil.BallCreation.HoleSizeDecreased");
        this.drillingMachineId = drillingMachineId;
        this.holeSize = holeSize;
    }

    public DrillingMachineId getDrillingMachineId() {
        return drillingMachineId;
    }

    public HoleSize getHoleSize() {
        return holeSize;
    }
}
