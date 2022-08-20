package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.DrillingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.HoleSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.NumerOfHoles;

public class DrillingMachineAdded extends DomainEvent {

    private final DrillingMachineId drillingMachineId;

    private final HoleSize holeSize;

    private final NumerOfHoles numerOfHoles;

    public DrillingMachineAdded(DrillingMachineId drillingMachineId, HoleSize holeSize, NumerOfHoles numerOfHoles) {
        super("FelipeGil.BallCreation.DrillingMachineAdded");
        this.drillingMachineId = drillingMachineId;
        this.holeSize = holeSize;
        this.numerOfHoles = numerOfHoles;
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
