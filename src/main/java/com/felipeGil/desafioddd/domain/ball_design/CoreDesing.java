package com.felipeGil.desafioddd.domain.ball_design;

import co.com.sofka.domain.generic.Entity;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreDesingId;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreSize;
import com.felipeGil.desafioddd.domain.ball_design.values.CoreType;

import java.util.Objects;

public class CoreDesing extends Entity<CoreDesingId> {

    private CoreType coreType;

    private CoreSize coreSize;

    public CoreDesing(CoreDesingId entityId, CoreType coreType, CoreSize coreSize) {
        super(entityId);
        this.coreType = coreType;
        this.coreSize = coreSize;
    }

    public void changeCoreType(CoreType coreType){
        this.coreType = Objects.requireNonNull(coreType);
    }

    public void increaseCoreSize(CoreSize coreSize){
        this.coreSize = Objects.requireNonNull(coreSize);
    }

    public void changeCoreType(CoreSize coreSize){
        this.coreSize = Objects.requireNonNull(coreSize);
    }

    public CoreType coreType(){
        return coreType;
    }

    public CoreSize coreSize(){
        return coreSize;
    }


}
