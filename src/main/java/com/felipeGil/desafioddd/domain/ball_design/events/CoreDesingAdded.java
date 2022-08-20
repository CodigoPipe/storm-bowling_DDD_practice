package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreSize;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreType;

public class CoreDesingAdded extends DomainEvent {

    private final CoreDesingId coreDesingId;

    private final CoreType coreType;

    private final CoreSize coreSize;

    public CoreDesingAdded(CoreDesingId coreDesingId, CoreType coreType, CoreSize coreSize) {
        super("FelipeGil.BallDesing.CoreDesingAdded");
        this.coreDesingId = coreDesingId;
        this.coreType = coreType;
        this.coreSize = coreSize;
    }

    public CoreDesingId getCoreDesingId() {
        return coreDesingId;
    }

    public CoreType getCoreType() {
        return coreType;
    }

    public CoreSize getCoreSize() {
        return coreSize;
    }
}
