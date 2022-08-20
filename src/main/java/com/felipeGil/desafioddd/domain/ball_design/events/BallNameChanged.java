package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.BallName;

import java.util.UUID;

public class BallNameChanged extends DomainEvent{


    private final BallName ballName;

    public BallNameChanged(BallName ballName) {
        super("FelipeGil.BallDesing.BallNameChanged");
        this.ballName = ballName;
    }


    public BallName getBallName() {
        return ballName;
    }
}
