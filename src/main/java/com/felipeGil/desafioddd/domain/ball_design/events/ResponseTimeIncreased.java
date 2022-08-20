package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ResponseTime;

public class ResponseTimeIncreased extends DomainEvent{

    private final CoverDesingId coverDesingId;

    private final ResponseTime responseTime;

    public ResponseTimeIncreased(CoverDesingId coverDesingId, ResponseTime responseTime) {
        super("FelipeGil.BallDesing.ResponseTimeIncreased");
        this.coverDesingId = coverDesingId;
        this.responseTime = responseTime;
    }

    public CoverDesingId getCoverDesingId() {
        return coverDesingId;
    }

    public ResponseTime getResponseTime() {
        return responseTime;
    }
}
