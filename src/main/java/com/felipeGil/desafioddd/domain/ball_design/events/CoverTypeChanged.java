package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverType;

public class CoverTypeChanged extends DomainEvent {

    private final CoverDesingId coverDesingId;

    private final CoverType coverType;

    public CoverTypeChanged(CoverDesingId coverDesingId, CoverType coverType) {
        super("FelipeGil.BallDesing.CoverTypeChanged");
        this.coverDesingId = coverDesingId;
        this.coverType = coverType;
    }

    public CoverDesingId getCoverDesingId() {
        return coverDesingId;
    }

    public CoverType getCoverType() {
        return coverType;
    }
}
