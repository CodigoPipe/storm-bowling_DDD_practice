package com.felipeGil.desafioddd.domain.ball_creation;

import co.com.sofka.domain.generic.Entity;
import com.felipeGil.desafioddd.domain.ball_creation.values.DrillingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.HoleSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.NumerOfHoles;

import java.util.Objects;

public class DrillingMachine extends Entity<DrillingMachineId> {

    private NumerOfHoles numerOfHoles;

    private HoleSize holeSize;

    private EmployeeId machineEmployeeId;

    public DrillingMachine(DrillingMachineId entityId, NumerOfHoles numerOfHoles, HoleSize holeSize) {
        super(entityId);
        this.numerOfHoles = numerOfHoles;
        this.holeSize = holeSize;
    }

    public void addEmployeeInCharge(EmployeeId employeeId){
        this.machineEmployeeId = Objects.requireNonNull(employeeId);
    }

    public void changeNumberOfHoles(NumerOfHoles numerOfHoles){
        this.numerOfHoles = Objects.requireNonNull(numerOfHoles);
    }

    public void increaseHoleSize(HoleSize holeSize){
        this.holeSize = Objects.requireNonNull(holeSize);
    }

    public void decreaseHoleSize(HoleSize holeSize){
        this.holeSize = Objects.requireNonNull(holeSize);
    }

    public NumerOfHoles numerOfHoles(){
        return numerOfHoles;
    }

    public HoleSize holeSize(){
        return holeSize;
    }

    public EmployeeId machineEmployeeId(){
        return machineEmployeeId;
    }


}
