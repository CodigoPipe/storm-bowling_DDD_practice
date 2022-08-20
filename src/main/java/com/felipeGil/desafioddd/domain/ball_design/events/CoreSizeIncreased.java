package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreSize;

public class CoreSizeIncreased extends DomainEvent {

    private final CoreDesingId coreDesingId;

    private final CoreSize coreSize;

    public CoreSizeIncreased(CoreDesingId coreDesingId, CoreSize coreSize) {
        super("FelipeGil.BallDesing.CoreSizeIncreased");
        this.coreDesingId = coreDesingId;
        this.coreSize = coreSize;
    }

    public CoreDesingId getCoreDesingId() {
        return coreDesingId;
    }

    public CoreSize getCoreSize() {
        return coreSize;
    }
}
