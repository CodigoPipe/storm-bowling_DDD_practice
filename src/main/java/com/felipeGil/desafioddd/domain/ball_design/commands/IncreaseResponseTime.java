package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.ResponseTime;

public class IncreaseResponseTime extends Command{

    private final BallDesingId ballDesingId;

    private final CoverDesingId coverDesingId;

    private final ResponseTime responseTime;

    public IncreaseResponseTime(BallDesingId ballDesingId, CoverDesingId coverDesingId, ResponseTime responseTime) {
        this.ballDesingId = ballDesingId;
        this.coverDesingId = coverDesingId;
        this.responseTime = responseTime;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public CoverDesingId getCoverDesingId() {
        return coverDesingId;
    }

    public ResponseTime getResponseTime() {
        return responseTime;
    }
}
