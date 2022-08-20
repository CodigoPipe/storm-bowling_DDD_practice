package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.DrillingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.NumerOfHoles;

public class NumberOfHolesChanged extends DomainEvent {

    private final DrillingMachineId drillingMachineId;

    private final NumerOfHoles numerOfHoles;

    public NumberOfHolesChanged(DrillingMachineId drillingMachineId, NumerOfHoles numerOfHoles) {
        super("FelipeGil.BallCreation.NumberOfHolesChanged");
        this.drillingMachineId = drillingMachineId;
        this.numerOfHoles = numerOfHoles;
    }

    public DrillingMachineId getDrillingMachineId() {
        return drillingMachineId;
    }

    public NumerOfHoles getNumerOfHoles() {
        return numerOfHoles;
    }
}
