package com.felipeGil.desafioddd.domain.ball_design;

import co.com.sofka.domain.generic.Entity;
import com.felipeGil.desafioddd.domain.ball_design.values.*;

import java.util.Objects;

public class CoverDesing extends Entity<CoverDesingId> {

    private CoverType coverType;

    private ResponseTime responseTime;

    private Surface surface;

    public CoverDesing(CoverDesingId entityId, CoverType coverType, ResponseTime responseTime, Surface surface) {
        super(entityId);
        this.coverType = coverType;
        this.responseTime = responseTime;
        this.surface = surface;
    }

    public void changeCoverType(CoverType coverType){
        this.coverType = Objects.requireNonNull(coverType);
    }

    public void changeSurface(Surface surface){
        this.surface = Objects.requireNonNull(surface);
    }

    public void increaseResponseTime(ResponseTime responseTime){
        this.responseTime = Objects.requireNonNull(responseTime);
    }

    public void decreaseResponseTime(ResponseTime responseTime){
        this.responseTime = Objects.requireNonNull(responseTime);
    }

    public CoverType coverType(){
        return coverType;
    }

    public Surface surface(){
        return surface;
    }

    public ResponseTime responseTime(){
        return responseTime;
    }

}
