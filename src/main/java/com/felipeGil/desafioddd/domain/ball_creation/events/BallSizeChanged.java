package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;

public class BallSizeChanged extends DomainEvent {

    private final CompactingMachineId compactingMachineId;

    private final BallSize ballSize;

    public BallSizeChanged(CompactingMachineId compactingMachineId, BallSize ballSize) {
        super("FelipeGil.BallCreation.BallSizeChanged");
        this.compactingMachineId = compactingMachineId;
        this.ballSize = ballSize;
    }

    public CompactingMachineId getCompactingMachineId() {
        return compactingMachineId;
    }

    public BallSize getBallSize() {
        return ballSize;
    }
}
