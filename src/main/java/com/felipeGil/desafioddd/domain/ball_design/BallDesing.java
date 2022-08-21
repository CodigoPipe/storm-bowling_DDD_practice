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

    public void decreaseBallWeight(BallWeight ballWeight){
        Objects.requireNonNull(ballWeight);
        appendChange(new BallWeightDecreased(ballWeight));
    }

    public void decreaseCoreSize(CoreDesingId coreDesingId, CoreSize coreSize){
        Objects.requireNonNull(coreDesingId);
        Objects.requireNonNull(coreSize);
        appendChange(new CoreSizeDecreased(coreDesingId, coreSize));
    }

    public void decreaseDensity(ColorDesingId colorDesingId, Density density){
        Objects.requireNonNull(colorDesingId);
        Objects.requireNonNull(density);
        appendChange(new DensityDecreased(colorDesingId, density));
    }

    public void decreaseResponseTime(CoverDesingId coverDesingId, ResponseTime responseTime){
        Objects.requireNonNull(coverDesingId);
        Objects.requireNonNull(responseTime);
        appendChange(new ResponseTimeDecreased(coverDesingId, responseTime));
    }

    public void fixStartDateOfBallDesing(StartDate startDate){
        Objects.requireNonNull(startDate);
        appendChange(new StartDateOfBallDesingFixed(startDate));
    }

    public void updateEndDateOfBallDesing(EndDate endDate){
        Objects.requireNonNull(endDate);
        appendChange(new EndDateOfBallDesingUpdated(endDate));
    }

    public void increaseBallWeight(BallWeight ballWeight){
        Objects.requireNonNull(ballWeight);
        appendChange(new BallWeightIncreased(ballWeight));
    }

    public void increaseCoreSize(CoreDesingId coreDesingId, CoreSize coreSize){
        Objects.requireNonNull(coreDesingId);
        Objects.requireNonNull(coreSize);
        appendChange(new CoreSizeIncreased(coreDesingId, coreSize));
    }

    public void increaseDensity(ColorDesingId colorDesingId, Density density){
        Objects.requireNonNull(colorDesingId);
        Objects.requireNonNull(density);
        appendChange(new DensityIncreased(colorDesingId, density));
    }

    public void increaseResponseTime(CoverDesingId coverDesingId, ResponseTime responseTime){
        Objects.requireNonNull(coverDesingId);
        Objects.requireNonNull(responseTime);
        appendChange(new ResponseTimeIncreased(coverDesingId, responseTime));
    }

    public BallName ballName(){
        return ballName;
    }

    public BallWeight ballWeight(){
        return ballWeight;
    }

    public StartDate startDate(){
        return startDate;
    }

    public EndDate endDate(){
        return endDate;
    }

    public ColorDesing colorDesing(){
        return colorDesing;
    }

    public CoreDesing coreDesing(){
        return coreDesing;
    }

    public CoverDesing coverDesing(){
        return coverDesing;
    }


}
