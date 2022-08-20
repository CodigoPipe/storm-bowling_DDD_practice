package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.Surface;

public class SurfaceChanged extends DomainEvent {

    private final CoverDesingId coverDesingId;

    private final Surface surface;

    public SurfaceChanged(CoverDesingId coverDesingId, Surface surface) {
        super("FelipeGil.BallDesing.SurfaceChanged");
        this.coverDesingId = coverDesingId;
        this.surface = surface;
    }

    public CoverDesingId getCoverDesingId() {
        return coverDesingId;
    }

    public Surface getSurface() {
        return surface;
    }
}
