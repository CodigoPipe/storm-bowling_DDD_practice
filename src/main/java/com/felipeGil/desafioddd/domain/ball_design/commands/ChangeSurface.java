package com.felipeGil.desafioddd.domain.ball_design.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoverDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.Surface;

public class ChangeSurface extends Command{

    private final BallDesingId ballDesingId;

    private final CoverDesingId coverDesingId;

    private final Surface surface;

    public ChangeSurface(BallDesingId ballDesingId, CoverDesingId coverDesingId, Surface surface) {
        this.ballDesingId = ballDesingId;
        this.coverDesingId = coverDesingId;
        this.surface = surface;
    }

    public BallDesingId getBallDesingId() {
        return ballDesingId;
    }

    public CoverDesingId getCoverDesingId() {
        return coverDesingId;
    }

    public Surface getSurface() {
        return surface;
    }
}
