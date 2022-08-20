package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.*;

public class AddCoverDesing extends Command{

    private final BallDesingId ballDesingId;

    private final CoverDesingId entityId;

    private final CoverType coverType;

    private final ResponseTime responseTime;

    private final Surface surface;

    public AddCoverDesing(BallDesingId ballDesingId, CoverDesingId entityId, CoverType coverType, ResponseTime responseTime, Surface surface) {
        this.ballDesingId = ballDesingId;
        this.entityId = entityId;
        this.coverType = coverType;
        this.responseTime = responseTime;
        this.surface = surface;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public CoverDesingId getEntityId() {
        return entityId;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public ResponseTime getResponseTime() {
        return responseTime;
    }

    public Surface getSurface() {
        return surface;
    }
}
