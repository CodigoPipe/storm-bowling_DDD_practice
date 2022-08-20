package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreSize;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreType;

public class AddCoreDesing extends Command{

    private final BallDesingId ballDesingId;

    private final CoreDesingId entityId;

    private final CoreType coreType;

    private final CoreSize coreSize;

    public AddCoreDesing(BallDesingId ballDesingId, CoreDesingId entityId, CoreType coreType, CoreSize coreSize) {
        this.ballDesingId = ballDesingId;
        this.entityId = entityId;
        this.coreType = coreType;
        this.coreSize = coreSize;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public CoreDesingId getEntityId() {
        return entityId;
    }

    public CoreType getCoreType() {
        return coreType;
    }

    public CoreSize getCoreSize() {
        return coreSize;
    }
}
