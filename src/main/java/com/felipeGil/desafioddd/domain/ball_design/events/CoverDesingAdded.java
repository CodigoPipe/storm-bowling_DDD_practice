package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverType;
import com.felipeGil.desafioddd.domain.ball_design.values.ResponseTime;
import com.felipeGil.desafioddd.domain.ball_design.values.Surface;

public class CoverDesingAdded extends DomainEvent {

    private final CoverDesingId coverDesingId;

    private final CoverType coverType;

    private final ResponseTime responseTime;

    private final Surface surface;

    public CoverDesingAdded(CoverDesingId coverDesingId, CoverType coverType, ResponseTime responseTime, Surface surface) {
        super("FelipeGil.BallDesing.CoverDesingAdded");
        this.coverDesingId = coverDesingId;
        this.coverType = coverType;
        this.responseTime = responseTime;
        this.surface = surface;
    }

    public CoverDesingId getCoverDesingId() {
        return coverDesingId;
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
