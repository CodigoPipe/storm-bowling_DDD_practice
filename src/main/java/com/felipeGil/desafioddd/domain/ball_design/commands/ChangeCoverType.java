package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverType;

public class ChangeCoverType extends Command{

    private final BallDesingId ballDesingId;

    private final CoverDesingId coverDesingId;

    private final CoverType coverType;

    public ChangeCoverType(BallDesingId ballDesingId, CoverDesingId coverDesingId, CoverType coverType) {
        this.ballDesingId = ballDesingId;
        this.coverDesingId = coverDesingId;
        this.coverType = coverType;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public CoverDesingId getCoverDesingId() {
        return coverDesingId;
    }

    public CoverType getCoverType() {
        return coverType;
    }
}
