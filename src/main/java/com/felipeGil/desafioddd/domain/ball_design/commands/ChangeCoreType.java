package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreType;

public class ChangeCoreType extends Command{

    private final BallDesingId ballDesingId;

    private final CoreDesingId coreDesingId;

    private final CoreType coreType;

    public ChangeCoreType(BallDesingId ballDesingId, CoreDesingId coreDesingId, CoreType coreType) {
        this.ballDesingId = ballDesingId;
        this.coreDesingId = coreDesingId;
        this.coreType = coreType;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public CoreDesingId getCoreDesingId() {
        return coreDesingId;
    }

    public CoreType getCoreType() {
        return coreType;
    }
}
