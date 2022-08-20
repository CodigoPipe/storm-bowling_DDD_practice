package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreType;

public class CoreTypeChanged extends DomainEvent {

    private final CoreDesingId coreDesingId;

    private final CoreType coreType;

    public CoreTypeChanged(CoreDesingId coreDesingId, CoreType coreType) {
        super("FelipeGil.BallDesing.CoreTypeChanged");
        this.coreDesingId = coreDesingId;
        this.coreType = coreType;
    }

    public CoreDesingId getCoreDesingId() {
        return coreDesingId;
    }

    public CoreType getCoreType() {
        return coreType;
    }
}
