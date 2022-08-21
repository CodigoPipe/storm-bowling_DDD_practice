package com.felipeGil.desafioddd.domain.ball_design;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.events.*;
import com.felipeGil.desafioddd.domain.ball_design.values.*;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;

import java.util.List;
import java.util.Objects;

public class BallDesing extends AggregateEvent<BallDesingId> {


    protected BallName ballName;

    protected BallWeight ballWeight;

    protected StartDate startDate;

    protected EndDate endDate;

    protected ColorDesing colorDesing;

    protected CoreDesing coreDesing;

    protected CoverDesing coverDesing;


    public BallDesing(BallDesingId entityId, BallName ballName, BallWeight ballWeight, StartDate startDate, EndDate endDate) {
        super(entityId);
        appendChange(new BallDesingCreated(ballName, ballWeight,startDate,endDate)).apply();
    }

   public BallDesing(BallDesingId entityId) {
        super(entityId);
        subscribe(new BallDesingChange(this));
    }

    public static BallDesing from(BallDesingId entityId, List<DomainEvent> events) {
        var ballDesing = new BallDesing(entityId);
        events.forEach(ballDesing::applyEvent);
        return ballDesing;
    }

    public void addColorDesing(ColorDesingId colorDesingId, ColorName colorName, Density density){
        Objects.requireNonNull(colorDesingId);
        Objects.requireNonNull(colorName);
        Objects.requireNonNull(density);
        appendChange(new ColorDesingAdded(colorDesingId, colorName, density));
    }

    public void addCoreDesing(CoreDesingId coreDesingId, CoreType coreType, CoreSize coreSize){
        Objects.requireNonNull(coreDesingId);
        Objects.requireNonNull(coreType);
        Objects.requireNonNull(coreSize);
        appendChange(new CoreDesingAdded(coreDesingId, coreType, coreSize));
    }

    public void addCoverDesing(CoverDesingId coverDesingId, CoverType coverType, ResponseTime responseTime, Surface surface){
        Objects.requireNonNull(coverDesingId);
        Objects.requireNonNull(coverType);
        Objects.requireNonNull(responseTime);
        Objects.requireNonNull(surface);
        appendChange(new CoverDesingAdded(coverDesingId, coverType, responseTime, surface));
    }

    public void changeBallName(BallName ballName){
        Objects.requireNonNull(ballName);
        appendChange(new BallNameChanged(ballName));
    }

    public void changeColorName(ColorDesingId colorDesingId, ColorName colorName){
        Objects.requireNonNull(colorDesingId);
        Objects.requireNonNull(colorName);
        appendChange(new ColorNameChanged(colorDesingId, colorName));
    }

    public void changeCoreType(CoreDesingId coreDesingId, CoreType coreType){
        Objects.requireNonNull(coreDesingId);
        Objects.requireNonNull(coreType);
        appendChange(new CoreTypeChanged(coreDesingId, coreType));
    }

    public void changeCoverType(CoverDesingId coverDesingId, CoverType coverType){
        Objects.requireNonNull(coverDesingId);
        Objects.requireNonNull(coverType);
        appendChange(new CoverTypeChanged(coverDesingId, coverType));
    }

    public void changeSurface(CoverDesingId coverDesingId, Surface surface){
        Objects.requireNonNull(coverDesingId);
        Objects.requireNonNull(surface);
        appendChange(new SurfaceChanged(coverDesingId, surface));
    }




}
