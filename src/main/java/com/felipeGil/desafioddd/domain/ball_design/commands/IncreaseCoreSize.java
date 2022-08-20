package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreSize;

public class IncreaseCoreSize extends Command{

    private final BallDesingId ballDesingId;

    private final CoreDesingId coreDesingId;

    private final CoreSize coreSize;

    public IncreaseCoreSize(BallDesingId ballDesingId, CoreDesingId coreDesingId, CoreSize coreSize) {
        this.ballDesingId = ballDesingId;
        this.coreDesingId = coreDesingId;
        this.coreSize = coreSize;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public CoreDesingId getCoreDesingId() {
        return coreDesingId;
    }

    public CoreSize getCoreSize() {
        return coreSize;
    }
}
