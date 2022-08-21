package com.felipeGil.desafioddd.domain.ball_creation;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.events.*;
import com.felipeGil.desafioddd.domain.ball_creation.values.*;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;
import com.felipeGil.desafioddd.domain.ball_design.BallDesingChange;
import com.felipeGil.desafioddd.domain.ball_design.events.BallNameChanged;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorDesingAdded;
import com.felipeGil.desafioddd.domain.ball_design.events.EndDateOfBallDesingUpdated;
import com.felipeGil.desafioddd.domain.ball_design.events.StartDateOfBallDesingFixed;
import com.felipeGil.desafioddd.domain.ball_design.values.*;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;

import java.util.List;
import java.util.Objects;


public class BallCreation extends AggregateEvent<BallCreationId> {


    protected StartDate startDate;

    protected EndDate endDate;

    protected CompactingMachine compactingMachine;

    protected DrillingMachine drillingMachine;

    protected Employee employee;

    public BallCreation(BallCreationId entityId, StartDate startDate, EndDate endDate) {
        super(entityId);
        appendChange(new BallCreationCreated(startDate, endDate)).apply();
    }

    public BallCreation(BallCreationId entityId) {
        super(entityId);
        subscribe(new BallCreationChange(this));
    }

    public static BallCreation from(BallCreationId entityId, List<DomainEvent> events) {
        var ballCreation = new BallCreation(entityId);
        events.forEach(ballCreation::applyEvent);
        return ballCreation;
    }

    public void addCompactingMachine(CompactingMachineId compactingMachineId , BallSize ballSize, Material material){
        Objects.requireNonNull(compactingMachineId);
        Objects.requireNonNull(ballSize);
        Objects.requireNonNull(material);
        appendChange(new CompactingMachineAdded(compactingMachineId, ballSize, material));
    }

    public void addDrillingMachine(DrillingMachineId drillingMachineId, HoleSize holeSize, NumerOfHoles numerOfHoles){
        Objects.requireNonNull(drillingMachineId);
        Objects.requireNonNull(holeSize);
        Objects.requireNonNull(numerOfHoles);
        appendChange(new DrillingMachineAdded(drillingMachineId, holeSize, numerOfHoles));
    }

    public void addEmployee(EmployeeId employeeId, Name name, MachineInCharge machineInCharge, Salary salary){
        Objects.requireNonNull(employeeId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(machineInCharge);
        Objects.requireNonNull(salary);
        appendChange(new EmployeeAdded(employeeId, name, machineInCharge, salary));
    }

    public void changeBallSize(CompactingMachineId compactingMachineId,BallSize ballSize){
        Objects.requireNonNull(compactingMachineId);
        Objects.requireNonNull(ballSize);
        appendChange(new BallSizeChanged(compactingMachineId,ballSize));
    }

    public void changeMachineInCharge(EmployeeId employeeId, MachineInCharge machineInCharge){
        Objects.requireNonNull(employeeId);
        Objects.requireNonNull(machineInCharge);
        appendChange(new MachineInChargeChanged(employeeId,machineInCharge));
    }

    public void changeMaterial(CompactingMachineId compactingMachineId, Material material){
        Objects.requireNonNull(compactingMachineId);
        Objects.requireNonNull(material);
        appendChange(new MaterialChanged(compactingMachineId,material));
    }

    public void changeNumberOfHoles(DrillingMachineId drillingMachineId, NumerOfHoles numerOfHoles){
        Objects.requireNonNull(drillingMachineId);
        Objects.requireNonNull(numerOfHoles);
        appendChange(new NumberOfHolesChanged(drillingMachineId,numerOfHoles));
    }

    public void decreaseHoleSize(DrillingMachineId drillingMachineId, HoleSize holeSize){
        Objects.requireNonNull(drillingMachineId);
        Objects.requireNonNull(holeSize);
        appendChange(new HoleSizeDecreased(drillingMachineId,holeSize));
    }

    public void fixStartDateOfBallCreation(StartDate startDate){
        Objects.requireNonNull(startDate);
        appendChange(new StartDateOfBallCreationFixed(startDate));
    }

    public void increaseHoleSize(DrillingMachineId drillingMachineId, HoleSize holeSize){
        Objects.requireNonNull(drillingMachineId);
        Objects.requireNonNull(holeSize);
        appendChange(new HoleSizeIncreased(drillingMachineId,holeSize));
    }

    public void increaseSalary(EmployeeId employeeId, Salary salary){
        Objects.requireNonNull(employeeId);
        Objects.requireNonNull(salary);
        appendChange(new SalaryIncreased(employeeId,salary));
    }

    public void updateEndDateOfBallCreation(EndDate endDate){
        Objects.requireNonNull(endDate);
        appendChange(new EndDateOfBallCreationUpdated(endDate));
    }

    public StartDate startDate() {
        return startDate;
    }

    public EndDate endDate() {
        return endDate;
    }

    public CompactingMachine compactingMachine() {
        return compactingMachine;
    }

    public DrillingMachine drillingMachine() {
        return drillingMachine;
    }

    public Employee employee() {
        return employee;
    }
}
